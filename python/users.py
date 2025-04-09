from faker import Faker
import pymysql

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

sql = "INSERT INTO users (`name`, `bio`, `avatar`, `created`, `account`, `password`) VALUES (%s, %s, %s,%s, %s, %s);"
for i in range(1,1001):
    id:int = 100000+i;
    index:int = 1000 + i;
    values.append(
        (fake.name(),fake.sentence(),f'https://gitee.com/clouder1023/wbresource/raw/master/avatar/avatar({i}).jpg',
         fake.date_time_between(start_date="-15y", end_date="now", tzinfo=None).__str__(),
         f'user{index}',f'pas{index}'
         )
    )
rows = cursor.executemany(sql,values)
conn.commit()
cursor.close()
conn.close()

print(rows)
