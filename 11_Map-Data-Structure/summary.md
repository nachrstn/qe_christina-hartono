# Map Data Structure
1. Iterable adalah sekumpulan data atau struktur data yagn dapat dilakukan iterasi atau perulangan. Hirarki interface pada iterable pada java dimulai dari Iterable, Collection, Set > SortedSet > NavigableSet, List, Queue > Deque > BlockungQueue > blockingQeque > TransferQueue. Iterable memiliki method Iterator(), Iterator merupakan class yang menangani iterasi dari sebuah iterable. 

2. List pada Java antara lain ArrayList (menyimpan data secara dinamis, mampu menampung data sebanyak mungkin selama memory komputer masih tersedia), LinkedList (struktur data yang menyimpan elemennya saling terhubung satu dengan yg lainnya), ImmutableList (tidak bisa menambahkan (add) data).

3. Map adalah struktur data yang digunakan untuk menyimpan banyak data di dalamnya, diidentifikasi dengan key, setiap key memiliki value. Bentuk Map pada Java seperti HashMap, WeakHashMap, IdentifyHashMap, LinkedHashMap, EnumHashMap.