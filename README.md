# Employee Management System  

A **fullstack CRUD application** for managing employees, built to explore and practice **Java Spring Boot**, **React**, and **Docker**.  

## 🚀 Tech Stack  
- **Backend:** [Spring Boot 3.5.4](https://spring.io/projects/spring-boot)  
- **Frontend:** [React 19.1.1](https://react.dev/)  
- **Database:** [MySQL 8.0.42](https://dev.mysql.com/)  
- **Containerization:** [Docker](https://www.docker.com/)  

## 📌 Features  
- Create new employee records  
- Read employee details  
- Update existing employees  
- Delete employees  
- Dockerized for easy deployment  

## 🏗️ Project Structure  
```
employee-management-system/
├── ems-backend/   # Spring Boot application
├── ems-frontend/  # React application
└── docker-compose.yml    # Docker compose file
```

## ⚙️ Getting Started  

### Prerequisites  
- [Java 17+](https://adoptium.net/)  
- [Node.js 18+](https://nodejs.org/)  
- [Docker](https://www.docker.com/) & [Docker Compose](https://docs.docker.com/compose/)  
- [MySQL 8.0+](https://dev.mysql.com/) (optional, if not running via Docker)  

### Running with Docker  
1. Clone the repository:  
   ```bash
   git clone https://github.com/TaviF24/employee-management-system.git
   cd employee-management-system
   ```
2. Build and start the containers:  
   ```bash
   docker-compose up --build
   ```
3. Access the application:  
   - Frontend: `http://localhost:5173`  
   - Backend: `http://localhost:8080/api/employees`  
   - MySQL: `localhost:3306`  

### Running without Docker  

#### Backend  
```bash
cd backend
./mvnw spring-boot:run
```

#### Frontend  
```bash
cd frontend
npm install
npm run dev
```

#### Database  
Make sure MySQL is running locally and add the connection settings in a `.env.properties` file located in `ems-backend/`. Also, add a `.env` file into the `ems-frontend/` where it will be stored the address of the backend.

## 📖 Learning Goals  
This project was built to:  
- Understand **Spring Boot application architecture**  
- Practice building a **fullstack CRUD app**  
- Improve my **docker knowledge**  
