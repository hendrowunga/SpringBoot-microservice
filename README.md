![Logo](diagrams/Diagram.png)

Repositori ini memuat modifikasi dari diagram, proyek demonstrasi yang menampilkan aplikasi berbasis layanan mikro. Tujuannya adalah untuk memberikan pemahaman praktis tentang struktur dan penerapan arsitektur layanan mikro. Proyek ini mencakup API Gateway, Config Server, Discovery Server, serta dua layanan mikro: Karyawan dan Perusahaan.

## Struktur Proyek

   - company: Berisi layanan mikro yang terkait dengan entitas perusahan.
   - confg-server: Mengelola konfigurasi terpusat untuk semua layanan micro.
   - discovery: Eureka Discovery Server untuk pendaftaran dan penemuan layanan.
   - employee: Berisi layanan mikro yang terkait dengan entitas karyawan.
   - gateway: Gerbang API untuk merutekan permintaan ke layanan mikro yang sesuai.
   - docker-compose.yml: File Docker Compose untuk menjalankan aplikasi dalam kontainer.





















