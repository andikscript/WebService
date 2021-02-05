<?php
Class Cari extends CI_Controller {

    var $API ="";

    function __construct() {
        parent::__construct();
        $this->API="http://127.0.0.1:8080/Perpustakaan/Api/Buku";
        $this->load->library('session');
        $this->load->library('curl');
        $this->load->helper('form');
        $this->load->helper('url');
    }

    function index(){
        $data['content'] = "Search Page";
        $this->load->view('cari/search',$data);
    }

    function search(){
        if(isset($_POST['cari'])){
            $idBuku =  $this->input->post('id');
            $data = json_decode($this->curl->simple_get($this->API.'/buku/'. $idBuku));
            $properties = get_object_vars($data);
            echo "<h1> Hasil Pencarian </h1>";
            echo "<table border='1'>";
            echo "<tr>";
            echo "<th> ID Buku </th>";
            echo "<th> Judul </th>";
            echo "<th> Pengarang </th>";
            echo "<th> Tahun Terbit </th>";
            echo "<th> Stok </th>";
            echo "</tr>";
            echo "<tr>";
            echo "<td>" .$properties['idBuku']. "</td>";
            echo "<td> " .$properties['judul']. " </td>";
            echo "<td> " .$properties['pengarang']. " </td>";
            echo "<td> " .$properties['tahunTerbit']. " </td>";
            echo "<td> " .$properties['stok']. " </td>";
            echo "</tr>";
            echo "</table>";
            
        } else {
            $this->load->view('Cari');
        }
    }
}