# REST API Testing
1. Perbedaaan antara API test dan Unit test
    Unit Test
    - Dilakukan oleh Developer
    - Fungsi-fungsi terpisah
    - Developer bisa mengakses source code.
    - Hanya Dasar functionality yang di test.
    - Scopenya terbatas.
    - Biasanya dilakukan sebelum build.

    API test
    - Tester perform it.
    - End to End.
    - Tidak bisa mengakses source code.
    - Hanya fungsi API saja.
    - Semua functional issue.
    - Scopenya lebih luas
    - Dilakukan setelah build.

2. Best Practices of API Testing
    - Kelompokkan test case kedalam beberapa kategori.
    - Beri judul yang sesuai pada setiap test.
    - Harus berhati-hati ketika melakukan test yang berhubungan dengan menghapus sesuatu.
    - Ketika membuat test case harus dipikirkan juga segala kombinasi input pada API, memahami masing-masing elemen yang diuji

3. Type of Bugs that API testing Detects
    - Gagal melakukan error handling pada keadaan tertentu.
    - Kesulitan untuk tersambung dan mendapat respon API.
    - Isu keamanan.
    - Performance Issues.
    - Error atau warning yang tidak tepat.
    - Struktur dari data respon tidak benar (JSON & XML)