from faker import Faker
import pymysql
import random

fake = Faker(locale='zh_CN')
values = []

conn = pymysql.connect(
    host="localhost",
    port=3306,
    user='root',
    password='123456',
    db='weibo'
)

cursor=conn.cursor()

base_tag = []
# tag优化
def get_post_tag():
    if(len(base_tag) < 500):
        sen:str=fake.sentence()
        base_tag.append(sen)
        return sen
    else:
        index:int = random.randint(0,499)
        return base_tag[index]

# 获取图片
def get_post_img():
    length:int = random.randint(0,9)
    if(length == 0):return ""
    base:list = []
    for i in range(length):
        index:int = random.randint(0,119)
        base.append(f"https://gitee.com/clouder1023/wbresource/raw/master/pimg/pimg({index}).jpg")
    return "||".join(base)
    

sql = "INSERT INTO posts (`userId`, `tag`, `content`, `images`, `created`) VALUES (%s,%s, %s, %s, %s);"
for i in range(50000):
    uid = random.randint(100001,101000)
    values.append(
        (uid,get_post_tag(),fake.text(max_nb_chars=200, ext_word_list=None),get_post_img(),
         fake.date_time_between(start_date="-15y", end_date="now", tzinfo=None).__str__()
         )
    )

rows = cursor.executemany(sql,values)
conn.commit()

cursor.close()
conn.close()
print(rows)