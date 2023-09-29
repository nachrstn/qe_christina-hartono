# Post Processor & Understanding Jmeter Results
1. Post Processor adalah elemen test plan yang digunakan untuk melakukan tindakan tertentu setelah pemrosesan  sampler request. Post processor ini biasanya digunakan untuk mengekstrak nilai tertentu dari respons sampler request, misalnya user dapat mengekstrak nilai variabel sesi dari permintaan HTTP dan meneruskan nilai variabel sesi tersebut ke permintaan berikutnya.

2. JSON path Digunakan untuk ekstrak isi dari json response. Beberapa ekspresi yang umum digunakan :
$ = root element
. = child operator (object)
[] = child operator (array)
.. = recursive descent (langsung ke objek)
* = wildcard (all things)
[start:end] = array slice operator borrowed

3. Menghitung Throughput 
Throughput = (number of requests) / (total time) * conversion
Keterangan: 
number of requests = jumlah permintaan yang dieksekusi dari waktu total = (lastSampleStartTime + lastSampleLoadTime - firstSampleStartTime) 
conversion = satuan nilai konversi, contoh 1000 akan mengonversi nilai ke detik, 1000*60 akan mengonversi nilai ke menit, dll.