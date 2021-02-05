<?php echo form_open_multipart('PinjamBuku/create');?>
<h1>Peminjaman Buku</h1>
<table>
    <tr><td>ID Anggota</td><td><?php echo form_input('idAnggota');?></td></tr>
    <tr><td>ID Buku</td><td><?php echo form_input('idBuku');?></td></tr>   
    <tr><td>Tanggal Pinjam</td><td><?php echo form_input('mulai');?></td></tr>  
    <tr><td>Tanggal Kembali</td><td><?php echo form_input('kembali');?></td></tr>    
    <tr><td colspan="2">
        <?php echo form_submit('submit','Simpan');?>
        <?php echo anchor('Cari','Cari Buku');?></td></tr>
</table>
<?php
echo form_close();
?>