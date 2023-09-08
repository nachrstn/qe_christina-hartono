# Pengenalan Restful API
1. API (Application Programming Interface) adalah sekumpulan aturan dan protokol yang memungkinkan berbagai perangkat lunak untuk berkomunikasi dan berinteraksi satu sama lain, sedangkan REST (Representational State Transfer) API adalah  jenis antarmuka aplikasi yang mengikuti prinsip-prinsip arsitektur REST dalam desainnya.

2. REST API menggunakan HTTP method seperti GET (untuk mengambil data), POST (untuk membuat data baru), PUT (untuk memperbarui data), dan DELETE (untuk menghapus data). 

3. Kode respons HTTP:
    - 200 OK: Permintaan berhasil diproses, dan server mengembalikan respons yang diharapkan.
    - 201 Created: Permintaan berhasil dan server membuat sumber daya baru.
    - 400 Bad Request: Permintaan dari client tidak valid atau tidak sesuai.
    - 404 Not Found: Sumber daya yang diminta tidak ditemukan di server.
    - 405 Method Not Allowed: Metode HTTP yang digunakan tidak diizinkan untuk sumber daya tertentu.
    - 500 Internal Server Error: Terjadi kesalahan internal di server yang menghentikan pemrosesan permintaan.