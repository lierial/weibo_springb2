import pymysql
import random
from faker import Faker
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

sql = "INSERT INTO `weibo`.`follows` (`followerId`, `followeeId`, `created`) VALUES (%s, %s, %s);"
for i in range(30000):
    print(f"当前进度：{i/30000}")
    auid = random.randint(100000,101000)
    buid = random.randint(100000,101000)
    values.append(
        (auid,buid,fake.date_time_between(start_date="-15y", end_date="now", tzinfo=None).__str__())
    )

print("—————执行完毕—————")
rows = cursor.executemany(sql,values)
conn.commit()
cursor.close()
conn.close()

print(rows)
