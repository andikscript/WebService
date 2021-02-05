<%-- 
    Document   : list
    Created on : Feb 3, 2021, 10:36:22 PM
    Author     : akunf
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hasil Pencarian Buku</title>
    </head>
    <body>
        <h1>Hasil Pencarian Buku</h1>
        <table border="1" width="800">
            <tr>
                <th>Judul Buku</th>
                <th>Pengarang</th>
                <th>Tahun Terbit</th>
                <th>Stok</th>
            </tr>
            <tr>
                <td>${buku.judul}</td>
                <td>${buku.pengarang}</td>
                <td>${buku.tahunTerbit}</td>
                <td>${buku.stok}</td>
            </tr>
            
        </table>
    </body>
</html>
