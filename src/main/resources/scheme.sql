-- Tabla DEPARTMENT
CREATE TABLE employee_db.department (
    id VARCHAR(10) PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    description TEXT,
    location VARCHAR(100) NOT NULL,
    phone_number VARCHAR(20) NOT NULL
);

-- Tabla EMPLOYEE
CREATE TABLE employee_db.employee (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100) NOT NULL,
    email VARCHAR(150) NOT NULL,
    gender VARCHAR(10),
    birth_date DATE NOT NULL,
    salary INT NOT NULL,
    job_title VARCHAR(100),
    department_id VARCHAR(10),
    CONSTRAINT fk_employee_department FOREIGN KEY (department_id)
        REFERENCES department(id)
        ON DELETE SET NULL
);

/* Oracle

-- Tabla DEPARTMENT
CREATE TABLE department (
    id VARCHAR2(10) PRIMARY KEY,
    name VARCHAR2(100) NOT NULL,
    description CLOB,
    location VARCHAR2(100),
    phone_number VARCHAR2(20)
);

-- Tabla EMPLOYEE con ID autoincrementable
CREATE TABLE employee (
    id NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    first_name VARCHAR2(100) NOT NULL,
    last_name VARCHAR2(100) NOT NULL,
    email VARCHAR2(150) NOT NULL,
    gender VARCHAR2(10),
    birth_date DATE,
    salary NUMBER,
    job_title VARCHAR2(100),
    department_id VARCHAR2(10),
    CONSTRAINT fk_employee_department FOREIGN KEY (department_id)
        REFERENCES department(id)
        ON DELETE SET NULL
);

*/