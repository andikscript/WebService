<?php echo form_open('cari/search');?>
<h1>Cari Buku</h1>
<table>
    <tr><td>ID Buku</td><td><?php echo form_input('id');?></td></tr>     
    <tr><td><?php echo form_submit('cari','Cari');?>
</table>
<?php
echo form_close();
?>