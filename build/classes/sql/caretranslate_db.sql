CREATE DATABASE IF NOT EXISTS caretranslate_db DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE caretranslate_db;

CREATE TABLE IF NOT EXISTS users (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(50), email VARCHAR(100), password VARCHAR(100), role VARCHAR(30), created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS language_translations (
  id INT AUTO_INCREMENT PRIMARY KEY,
  category VARCHAR(50),
  zh_text VARCHAR(255) NOT NULL,
  vi_text VARCHAR(255),
  id_text VARCHAR(255),
  fil_text VARCHAR(255),
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS care_records (
  id INT AUTO_INCREMENT PRIMARY KEY,
  type VARCHAR(50), record_date VARCHAR(20), record_time VARCHAR(20), content VARCHAR(255), note VARCHAR(255), created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS sos_records (
  id INT AUTO_INCREMENT PRIMARY KEY,
  type VARCHAR(50), phone VARCHAR(50), note VARCHAR(255), created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS lost_reports (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(50), location VARCHAR(255), last_time VARCHAR(50), police_station VARCHAR(100), phone VARCHAR(50), status VARCHAR(30), created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO language_translations(category, zh_text, vi_text, id_text, fil_text) VALUES
('飲食','請喝水。','Xin hãy uống nước.','Silakan minum air.','Please drink water.'),
('用藥','請吃藥。','Xin hãy uống thuốc.','Silakan minum obat.','Please take medicine.'),
('身體','你哪裡不舒服？','Bạn khó chịu ở đâu?','Bagian mana yang tidak nyaman?','Where do you feel uncomfortable?'),
('緊急','請幫忙，病人走失了。','Xin giúp đỡ, bệnh nhân bị lạc.','Tolong bantu, pasien hilang.','Please help, the patient is missing.');

-- v2.5 後台管理示範資料
INSERT INTO users(name,email,password,role) VALUES
('小美','family@example.com','1234','家屬'),
('Lina','caregiver@example.com','1234','外籍照護員'),
('阿公','elder@example.com','1234','被照顧者'),
('Admin','admin@example.com','admin','管理者');

INSERT INTO care_records(type, record_date, record_time, content, note) VALUES
('用藥','2026/07/02','08:00','早餐後已服藥','由 Lina 紀錄'),
('血壓','2026/07/02','09:00','120/80 mmHg','正常'),
('體溫','2026/07/02','10:00','36.7°C','正常');

INSERT INTO sos_records(type, phone, note) VALUES
('跌倒','119 / 家屬 0912-345-678','顯示電話，不自動撥號'),
('走失','110 / 最近警局','提供定位與警局通報流程'),
('呼吸困難','119','緊急求助電話顯示');
