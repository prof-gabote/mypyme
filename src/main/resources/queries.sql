DROP DATABASE employee_db;

CREATE DATABASE employee_db;

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

DROP TABLE employee_db.employee ;
DROP TABLE employee_db.department;

insert into employee_db.department (id, name, description, location, phone_number) values ('LGL', 'Legal', 'Crispy baked radish chips, a healthy snack alternative.', 'MILANO', '+86 891 899 7354');
insert into employee_db.department (id, name, description, location, phone_number) values ('ACC', 'Accounting', 'Crunchy cacao nibs, great for adding to smoothies or baking.', 'PARIS', '+7 222 229 1781');
insert into employee_db.department (id, name, description, location, phone_number) values ('PRM','Product Management', 'A mix of strawberries, blueberries, and raspberries, perfect for smoothies.', 'HERMITAGE', '+359 895 897 1819');
insert into employee_db.department (id, name, description, location, phone_number) values ('RAD','Research and Development', 'Multi-functional grater for cheese and vegetables.', 'WHEELING', '+81 699 933 2269');
insert into employee_db.department (id, name, description, location, phone_number) values ('SUP','Support', 'Fun instruments to introduce kids to music.', 'DWIGHT', '+66 156 194 0649');
insert into employee_db.department (id, name, description, location, phone_number) values ('MAR','Marketing', 'Personalized calendar with your favorite photos.', 'BREMEN', '+20 309 566 6864');
insert into employee_db.department (id, name, description, location, phone_number) values ('SLS','Sales', 'High-quality organic honey from local farms.', 'WIEN', '+7 391 222 2222');
insert into employee_db.department (id, name, description, location, phone_number) values ('HHR','Human Resources', 'Handmade ceramic mugs with unique designs.', 'SAN FRANCISCO', '+7 861 222 2222');

/* INSERT PARA LA PARTE 1 */
insert into employee_db.employee (first_name, last_name, email, gender, birth_date, salary, job_title, department_id) values ('Ardis', 'Vellacott', 'avellacott0@yellowpages.com', 'Female', '1977/07/21', 2108, 'Statistician III', 'PRM');
insert into employee_db.employee (first_name, last_name, email, gender, birth_date, salary, job_title, department_id) values ('Witty', 'Lutsch', 'wlutsch1@samsung.com', 'Male', '1981/04/02', 1414, 'Web Designer III', 'ACC');
insert into employee_db.employee (first_name, last_name, email, gender, birth_date, salary, job_title, department_id) values ('Peter', 'Fallanche', 'pfallanche2@deliciousdays.com', 'Male', '1990/10/16', 1123, 'Recruiting Manager', 'SUP');
insert into employee_db.employee (first_name, last_name, email, gender, birth_date, salary, job_title, department_id) values ('Rutherford', 'Littlejohn', 'rlittlejohn3@alexa.com', 'Male', '1972/11/07', 791, 'Research Associate', 'RAD');
insert into employee_db.employee (first_name, last_name, email, gender, birth_date, salary, job_title, department_id) values ('Laural', 'Dimitriev', 'ldimitriev4@ow.ly', 'Female', '1986/07/05', 2318, 'Safety Technician II', 'SLS');
insert into employee_db.employee (first_name, last_name, email, gender, birth_date, salary, job_title, department_id) values ('Irv', 'Dmitriev', 'idmitriev5@amazon.de', 'Male', '1982/07/09', 1528, 'Senior Cost Accountant', 'SLS');
insert into employee_db.employee (first_name, last_name, email, gender, birth_date, salary, job_title, department_id) values ('Pattie', 'Consterdine', 'pconsterdine6@house.gov', 'Agender', '1988/01/05', 1619, 'Office Assistant II', 'RAD');
insert into employee_db.employee (first_name, last_name, email, gender, birth_date, salary, job_title, department_id) values ('Eulalie', 'Roddie', 'eroddie7@psu.edu', 'Female', '1998/07/31', 2152, 'Administrative Assistant II', 'HHR');
insert into employee_db.employee (first_name, last_name, email, gender, birth_date, salary, job_title, department_id) values ('Elihu', 'Purkins', 'epurkins8@ihg.com', 'Male', '1982/03/17', 1076, 'General Manager', 'SLS');
insert into employee_db.employee (first_name, last_name, email, gender, birth_date, salary, job_title, department_id) values ('Wang', 'Scarratt', 'wscarratt9@google.nl', 'Male', '1973/05/13', 1304, 'Structural Analysis Engineer', 'MAR');
insert into employee_db.employee (first_name, last_name, email, gender, birth_date, salary, job_title, department_id) values ('Korie', 'Gallant', 'kgallanta@theglobeandmail.com', 'Female', '1983/05/16', 1001, 'Speech Pathologist', 'SUP');
insert into employee_db.employee (first_name, last_name, email, gender, birth_date, salary, job_title, department_id) values ('Eilis', 'Gartland', 'egartlandb@virginia.edu', 'Female', '1971/12/24', 1922, 'Geologist I', 'ACC');
insert into employee_db.employee (first_name, last_name, email, gender, birth_date, salary, job_title, department_id) values ('Dorothea', 'Sagg', 'dsaggc@123-reg.co.uk', 'Female', '1987/10/26', 1360, 'Project Manager', 'MAR');
insert into employee_db.employee (first_name, last_name, email, gender, birth_date, salary, job_title, department_id) values ('Wylma', 'Albertson', 'walbertsond@freewebs.com', 'Female', '1992/03/07', 2151, 'Environmental Specialist', 'ACC');
insert into employee_db.employee (first_name, last_name, email, gender, birth_date, salary, job_title, department_id) values ('Eilis', 'Catling', 'ecatlinge@whitehouse.gov', 'Female', '1988/05/01', 2099, 'Electrical Engineer', 'LGL');
insert into employee_db.employee (first_name, last_name, email, gender, birth_date, salary, job_title, department_id) values ('Nathan', 'Wagg', 'nwaggf@earthlink.net', 'Male', '1975/11/03', 2465, 'Operator', 'LGL');
insert into employee_db.employee (first_name, last_name, email, gender, birth_date, salary, job_title, department_id) values ('Rheta', 'Wycliffe', 'rwycliffeg@cbc.ca', 'Female', '1983/08/25', 2463, 'Technical Writer', 'HHR');
insert into employee_db.employee (first_name, last_name, email, gender,employee birth_date, salary, job_title, department_id) values ('Lin', 'McGeagh', 'lmcgeaghh@usatoday.com', 'Male', '1972/06/07', 1427, 'Junior Executive', 'SUP');
insert into employee_db.employee (first_name, last_name, email, gender, birth_date, salary, job_title, department_id) values ('Inga', 'Ivashnikov', 'iivashnikovi@tiny.cc', 'Female', '1986/08/07', 1210, 'Automation Specialist II', 'RAD');
insert into employee_db.employee (first_name, last_name, email, gender, birth_date, salary, job_title, department_id) values ('Emmy', 'Crady', 'ecradyj@constantcontact.com', 'Female', '1981/12/30', 1101, 'Sales Associate', 'RAD');

