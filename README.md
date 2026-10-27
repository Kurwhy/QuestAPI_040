# 📱 QuestAPI — Android CRUD Application

### Android Application with Kotlin & API Integration

**QuestAPI** adalah proyek aplikasi Android yang dikembangkan menggunakan **Kotlin** untuk mempraktikkan pengelolaan data melalui antarmuka mobile.

Aplikasi menyediakan halaman utama, formulir input, tampilan detail, serta proses penambahan, perubahan, dan penghapusan data. Proyek ini berfokus pada penerapan operasi **CRUD (Create, Read, Update, Delete)** dan navigasi antarlayar.

---

## ✨ Fitur Utama

| Fitur | Deskripsi |
|---|---|
| Home | Menampilkan halaman utama dan daftar data |
| Create | Menambahkan data melalui formulir |
| Read | Melihat data dan informasi detail |
| Update | Mengubah data yang telah dimasukkan |
| Delete | Menghapus data melalui antarmuka aplikasi |
| Navigasi | Perpindahan antarlayar dalam aplikasi |

---

## 📱 Tampilan Aplikasi

### 1. Home Page

Halaman utama menampilkan antarmuka awal aplikasi dan menyediakan akses untuk melihat maupun mengelola data yang tersedia.

![Home Page](https://github.com/user-attachments/assets/32fcbf4c-3148-4a61-9dfd-da9cdda0c6af)

### 2. Form Input Data

Halaman input menyediakan formulir untuk memasukkan data baru ke dalam aplikasi.

Pengguna dapat mengisi informasi yang dibutuhkan sebelum melanjutkan proses penambahan data.

![Form Input](https://github.com/user-attachments/assets/30407ccb-3e90-4cde-92ee-3ff65f4cb56e)

### 3. Hasil Penambahan Data

Tampilan ini menunjukkan hasil setelah pengguna melakukan proses penambahan data melalui formulir.

![Hasil Input](https://github.com/user-attachments/assets/e7053d08-fbae-42bc-8da1-8169b654072f)

### 4. Detail Data

Halaman detail menyajikan informasi lebih lengkap mengenai data yang dipilih dari halaman utama.

![Detail Data](https://github.com/user-attachments/assets/79b46f83-2787-4341-ae37-3a52c93e6429)

### 5. Update Data

Halaman update memungkinkan pengguna mengubah informasi data yang telah tersedia melalui formulir pengeditan.

![Update Data](https://github.com/user-attachments/assets/d31bc673-d4e2-4585-bf2c-40bc743bc866)

### 6. Hasil Update Data

Setelah proses perubahan, aplikasi menampilkan data dengan informasi yang telah diperbarui.

![Hasil Update](https://github.com/user-attachments/assets/a2cb6357-2a36-49d3-bfdb-864077c7a192)

### 7. Delete Data

Tampilan ini memperlihatkan proses penghapusan data yang dipilih pengguna.

![Delete Data](https://github.com/user-attachments/assets/4047520d-8381-4f7e-b154-4867cbb478da)

### 8. Hasil Delete Data

Halaman ini menampilkan kondisi data setelah proses penghapusan dilakukan.

![Hasil Delete](https://github.com/user-attachments/assets/5614536b-8e1d-4cd3-be82-90e216516d44)

---

## 🔄 Alur Pengelolaan Data

```text
Home
  |
  +---- Tambah Data
  |        |
  |        +---- Hasil Input
  |
  +---- Detail Data
           |
           +---- Update Data
           |        |
           |        +---- Hasil Update
           |
           +---- Delete Data
                    |
                    +---- Hasil Delete
```

---

## 🛠️ Teknologi yang Digunakan

| Teknologi | Kegunaan |
|---|---|
| Kotlin | Bahasa pemrograman aplikasi |
| Android SDK | Platform pengembangan Android |
| Gradle Kotlin DSL | Konfigurasi build dan dependency |
| Android Studio | IDE untuk pengembangan dan pengujian |

Proyek ini bernama QuestAPI dan menunjukkan alur CRUD. Namun, detail layanan API, library HTTP, dan metode penyimpanan yang digunakan belum diverifikasi secara menyeluruh dari source code, sehingga tidak disebutkan sebagai teknologi yang sudah terbukti digunakan.

---

## 🚀 Instalasi dan Menjalankan Aplikasi

### Persyaratan

- Android Studio
- Android SDK yang kompatibel
- JDK sesuai konfigurasi Gradle
- Emulator Android atau perangkat fisik

### 1. Clone Repository

```bash
git clone https://github.com/Kurwhy/QuestAPI_040.git
cd QuestAPI_040
```

### 2. Buka di Android Studio

Jalankan Android Studio, pilih **Open**, lalu pilih folder `QuestAPI_040`.

### 3. Sinkronisasi Gradle

Tunggu proses **Gradle Sync** hingga selesai dan pastikan seluruh dependency telah terinstal.

### 4. Jalankan Aplikasi

Pilih emulator atau perangkat Android, kemudian klik tombol **Run**.

Jika aplikasi menggunakan layanan API eksternal, pastikan layanan dan konfigurasi alamat server yang dibutuhkan tersedia.

---

## 📂 Struktur Project

```text
QuestAPI_040/
├── app/
│   └── src/
├── gradle/
├── build.gradle.kts
├── settings.gradle.kts
├── gradle.properties
├── gradlew
├── gradlew.bat
└── README.md
```

---

## 🎯 Tujuan Pengembangan

Proyek ini bertujuan mempraktikkan pengembangan aplikasi Android menggunakan Kotlin, meliputi:

- Pembuatan antarmuka aplikasi mobile.
- Navigasi antarlayar.
- Pengelolaan input pengguna.
- Implementasi antarmuka CRUD.
- Penyajian detail dan hasil perubahan data.
- Pengenalan struktur proyek Android berbasis Gradle.

---

## 👨‍💻 Developer

**Kurwhy**

GitHub: [github.com/Kurwhy](https://github.com/Kurwhy)

Repository: [QuestAPI_040](https://github.com/Kurwhy/QuestAPI_040)

---

*Developed with Kotlin & Android Studio.*
