# Webservice Server (JAX-RS) & Webservice Client (Codeigniter 3)
Aplikasi Web dengan Webservice Server menggunakan JAX-RS dan Webservice Client menggunakan Framework Codeigniter 3 

## Build Tool :
- [x] Maven

## Webserver :
- [x] Payara Server

## Database :
- [x] Mysql

## Installation :
  * Webservice Server :
1. Open Project yang ada di folder 'Webservice Server di IDE'
2. Kemudian Jalankan Xampp (Apache & Mysql)
3. Buat Database perpus
4. Import database perpus di folder 'database' (perpus.sql)
5. Run (Jangan lupa menggunakan Webserver Payara Server)
6. Done

* Webservice Client :
1. Jalankan Xampp (Apache & Mysql)
2. Copy folder 'webservice_client' yang ada di dalam 'WebService Client' ke folder 'xampp/htdocs/'
3. Done

## Fitur :
* Akses Servlet : 
> http://localhost:8080/Perpustakaan/PinjamBuku

* Akses RESTFul API Input Pinjam Buku : 
> http://localhost:8080/Perpustakaan/Api/Pinjam/pinjam/

* Akses RESTFul API Pencarian Buku : 
> http://localhost:8080/Perpustakaan/Api/Buku/buku/{idbuku}

* Akses Webservice Client : 
> http://localhost/webservice_client/index.php/PinjamBuku
