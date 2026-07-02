# 🌏 CareTranslate AI Japandi

### 智慧長照即時翻譯與照護管理系統

> **Java Swing｜MVC｜MySQL｜AI Translation｜Long-Term Care**

![Java](https://img.shields.io/badge/Java-JDK11-orange)
![Swing](https://img.shields.io/badge/GUI-Java%20Swing-blue)
![MySQL](https://img.shields.io/badge/Database-MySQL-4479A1)
![Architecture](https://img.shields.io/badge/Architecture-MVC-success)
![Version](https://img.shields.io/badge/Version-v2.5-brightgreen)
![License](https://img.shields.io/badge/License-MIT-green)

---

# 📖 專案介紹

**CareTranslate AI Japandi** 是一套專為**長期照護**所設計的智慧翻譯與照護管理系統。

系統採用 **Java Swing** 建立圖形化介面，使用 **MVC（Model-View-Controller）架構** 開發，並搭配 **MySQL** 資料庫管理資料，提供照護人員、外籍照顧者及管理者一個整合式平台。

透過語音翻譯、文字翻譯、常用照護語句、照護紀錄及 SOS 緊急求助等功能，降低語言隔閡，提高照護效率與品質。

---

# 🎯 開發目的

在長照環境中，外籍照顧者與被照顧者常因語言不同而影響照護品質。

本專案希望透過資訊科技建立一套完整的平台，協助：

* 即時語音翻譯
* 多語言文字翻譯
* 常用照護語句查詢
* 照護紀錄管理
* 緊急事件處理
* 管理後台整合

讓照護工作更加便利、安全與有效率。

---

# ✨ 系統特色

* 🌏 AI 即時翻譯
* 🎙️ 語音翻譯
* 💬 文字翻譯
* 📚 常用照護語句
* 📝 照護紀錄
* 🚨 SOS 緊急求助
* 📍 走失協尋
* 👮 協尋通報
* 🔔 系統通知
* 👤 個人資料管理
* 🛠️ 管理者後台
* 🗄️ MySQL 資料庫
* 🏗️ MVC 三層式架構

---

# 📋 系統功能

## 👤 使用者系統

* 使用者登入
* 使用者註冊
* 身分管理
* 個人資料維護

---

## 🏠 首頁

整合所有主要功能：

* 即時翻譯
* 照護紀錄
* 常用語句
* SOS
* 通知中心
* 個人資料

---

## 🎙️ 語音翻譯

功能：

* 語音輸入
* 即時翻譯
* 多語言切換
* 翻譯紀錄

---

## 💬 文字翻譯

提供：

* 中文輸入
* 外語翻譯
* 翻譯歷史
* 快速複製

---

## 📚 常用照護語句

建立照護情境：

* 用餐
* 用藥
* 洗澡
* 睡眠
* 如廁
* 復健

方便快速查詢。

---

## 📝 照護紀錄

管理每日：

* 新增紀錄
* 修改紀錄
* 查詢紀錄
* 刪除紀錄

---

## 🚨 SOS 緊急求助

快速建立：

* SOS 通報
* 緊急事件
* 緊急聯絡

---

## 📍 走失協尋

建立：

* 走失位置
* 走失資訊
* 協尋紀錄
* 警政通報

---

## 🔔 通知中心

整合：

* 系統通知
* SOS 提醒
* 照護提醒

---

## 🛠️ 管理者後台

管理：

* 使用者
* 常用語句
* 照護紀錄
* SOS 紀錄
* 走失案件

---

# 🏗️ 系統架構

本專案採用 MVC 架構。

```text
CareTranslateAI
│
├── Controller
├── Service
├── DAO
├── Model
├── Util
├── Exception
└── MySQL Database
```

---

# 📂 專案結構

```text
src
│
├── controller
├── model
├── dao
│   └── impl
├── service
│   └── impl
├── util
└── exception
```

---

# 💻 使用技術

| 技術      | 說明         |
| ------- | ---------- |
| Java    | JDK 11     |
| Swing   | GUI 使用者介面  |
| MVC     | 系統架構       |
| JDBC    | MySQL 連線   |
| MySQL   | 關聯式資料庫     |
| Eclipse | 開發工具       |
| Git     | 版本控制       |
| GitHub  | 專案管理       |
| Figma   | UI / UX 設計 |

---

# 🗄️ 資料庫

主要資料表：

* User
* Phrase
* CareRecord
* SosRecord
* LostReport

---

# 🚀 執行方式

## 1.專案

```bash
git clone https://github.com/你的GitHub帳號/CareTranslateAI.git
```

---

## 2. 建立 MySQL 資料庫

```sql
CREATE DATABASE caretranslate;
```

---

## 3. 修改資料庫設定

請修改 `DBUtil.java` 的資料庫連線資訊：

```properties
db.url=jdbc:mysql://localhost:3306/caretranslate
db.user=root
db.password=你的密碼
```

---

## 4. 執行程式

執行：

```text
Main.java
```

即可啟動系統。

---

# 🔮 未來規劃

* AI 語音辨識
* AI 翻譯優化
* Google Translate API 串接
* OpenAI API 整合
* LINE Notify 推播
* Google Maps 定位
* Android App
* iOS App
* 雲端同步
* PDF 照護報表

---

# 👨‍💻 作者

**甘少棠**

UI / UX Designer｜Java Developer

**CareTranslate AI Japandi**

智慧長照即時翻譯與照護管理系統

---

# 📄 License

MIT License

Copyright © 2026 KST Studio
