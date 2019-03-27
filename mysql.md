# MySQL Install

1. unzip to `your_mysql_directory`

2. create `my.ini` file

```
[mysql]
# 设置 mysql 客户端默认字符集
default-character-set=utf8mb4 
[mysqld]
#设置 3306 端口
port = 3306 
# 设置 mysql 的安装目录
basedir=your_mysql_directory
# 设置 mysql 数据库的数据的存放目录
datadir=your_mysql_directory\data
# 允许最大连接数
max_connections=200
# 服务端使用的字符集默认为比特编码的 latin1 字符集
character-set-server=utf8mb4
# 创建新表时将使用的默认存储引擎
default-storage-engine=INNODB
# 开启标准的 explicit_defaults_for_timestamp 功能
explicit_defaults_for_timestamp=true
```

3. Initialize

```
C:\dev\mysql\bin> mysqld --initialize --user=mysql --console
```
4. Install Windows Service

```
C:\dev\mysql\bin> mysqld --install mysql --defaults-file=C:/dev/mysql/my.ini
```

5. Start MySQL Service

```
> net start mysql
```

6. Login MySQL

```
C:\dev\mysql\bin> mysql -u root -p 
```

7. Change password

```
mysql> set password = password('system');
mysql> quit
```

8. Check

```
mysql> show variables like 'char%'
mysql> show variables like 'coll%'
```

