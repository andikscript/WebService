<?php
Class PinjamBuku extends CI_Controller{

    var $API ="";

    function __construct() {
        parent::__construct();
        $this->API="http://127.0.0.1:8080/Perpustakaan/Api/Pinjam";
        $this->load->library('session');
        $this->load->library('curl');
        $this->load->helper('form');
        $this->load->helper('url');
    }

    // menampilkan data 
    function index(){
        $data['content'] = "Home Page";
        $this->load->view('pinjam/create',$data);
    }

    // insert data 
    function create(){
        if(isset($_POST['submit'])){
            $data = array(
                'idAnggota'       =>  $this->input->post('idAnggota'),
                'idBuku'      =>  $this->input->post('idBuku'),
                'mulai'      =>  $this->input->post('mulai'),
                'kembali'     =>  $this->input->post('kembali'));
            $insert =  $this->curl->simple_post($this->API.'/pinjam', $data, array(CURLOPT_BUFFERSIZE => 10)); 
            if($insert)
            {
                $this->session->set_flashdata('hasil','Insert Data Berhasil');
            }else
            {
               $this->session->set_flashdata('hasil','Insert Data Gagal');
            }
            redirect('PinjamBuku');
        }else{
            $this->load->view('PinjamBuku');
        }
    }

    // edit data
    function edit(){
        if(isset($_POST['submit'])){
            $data = array(
                'nim'       =>  $this->input->post('nim'),
                'nama'      =>  $this->input->post('nama'),
                'prodi'     =>  $this->input->post('prodi'));
            $update =  $this->curl->simple_put($this->API.'/mahasiswa/'. $data["nim"], $data, array(CURLOPT_BUFFERSIZE => 10)); 
            if($update)
            {
                $this->session->set_flashdata('hasil','Update Data Berhasil');
            }else
            {
               $this->session->set_flashdata('hasil','Update Data Gagal');
            }
            redirect('mahasiswa');
        }else{
            $params = array('id'=>  $this->uri->segment(3));
            $data['data'] = json_decode($this->curl->simple_get($this->API.'/mahasiswa',$params));
            $this->load->view('mahasiswa/edit',$data);
        }
    }


    // delete data
    function delete($nim){
        if(empty($nim)){
            redirect('mahasiswa');
        }else{
            $delete =  $this->curl->simple_delete($this->API.'/mahasiswa/'. $nim, array('id'=>$id), array(CURLOPT_BUFFERSIZE => 10)); 
            if($delete)
            {
                $this->session->set_flashdata('hasil','Delete Data Berhasil');
            }else
            {
               $this->session->set_flashdata('hasil','Delete Data Gagal');
            }
            redirect('mahasiswa');
        }
    }
}