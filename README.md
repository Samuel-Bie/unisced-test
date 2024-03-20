# Evidence video

https://www.loom.com/share/f502b76d8cc34a6c8a03268bc11a07e5?sid=58b10fa3-c6b3-41ea-8c04-033a60583226

# Getting Started

### Prerequisites
1. GIT
1. JDK 17 or 21
1. MYSQL v.8
1. Preferred IDE (Spring Tool Suite 4 for  recommended)
1. Postman

### Installation

Clone this repository

```
	
	git clone https://github.com/Samuel-Bie/unisced-test.git
		
```

Navigate to the project directory and load the project into your IDE

Install all the dependencies on pom.xml

### Running the project
1. Run using your preferred IDE.
	It will be available in http://localhost:8080
	
2. After successfully running the project insert the following user into the database (For testing perposes)

```sql



INSERT INTO `unisced`.`users`
(`id`,
`name`,
`password`,
`username`)
VALUES
(1,
"Admin",
"$2a$10$gqHrslMttQWSsDSVRTK1OehkkBiXsJ/a4z2OURU./dizwOQu5Lovu",
"administrator");

```
2. Open postman to start testing, or just import the following collection to your postman https://www.postman.com/lunar-trinity-648598/workspace/job-applications/collection/7413633-b55189a8-10d5-4a6b-9914-135984e5bce4?action=share&creator=7413633

Credentials

```json

"username":"administrator",
"Password": "admin"

```

The endpoints are documented on postman collection published



see this link https://documenter.getpostman.com/view/7413633/2sA358cQet 
