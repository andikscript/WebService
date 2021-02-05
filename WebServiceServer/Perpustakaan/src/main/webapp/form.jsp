<%-- 
    Document   : form
    Created on : Feb 3, 2021, 12:08:13 PM
    Author     : andik
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pinjam Buku</title>
        <link href="datepicker/modul/date_picker_bootstrap/bootstrap.min.css" rel="stylesheet" media="screen">
        <link href="datepicker/modul/date_picker_bootstrap/bootstrap-datetimepicker.min.css" rel="stylesheet" media="screen">
    </head>
    <body>
        <div class="container">
            <div class="col-lg-4">  
                <div class="page-header">
                    <h3>Form Pinjam Buku</h3>
                </div>
                <form role="form" class="form-horizontal" method="POST" action="PinjamBuku">
                    <div class="form-group">
                        <label>ID Anggota</label>
                            <input type="text" name="idanggota" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>ID Buku</label>
                            <input type="text" name="idbuku" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Tanggal Pinjam</label>
                            <div class="input-group date form_date col-md-5" data-date="" data-date-format="yyyy-mm-dd" data-link-field="dtp_input2" data-link-format="yyyy-mm-dd">
                                <input class="form-control" size="10" type="text" name="pinjam">
                                <span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
                            </div>
                    </div>
                    <div class="form-group">
                        <label>Tanggal Kembali</label>
                            <div class="input-group date form_date col-md-5" data-date="" data-date-format="yyyy-mm-dd" data-link-field="dtp_input2" data-link-format="yyyy-mm-dd">
                                <input class="form-control" size="10" type="text" name="kembali">
                                <span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
                            </div>
                    </div> <br/>
                    <div class="form-group">
                        <button type="submit" class="btn btn-primary">Insert Data</button>
                        <button type="reset" class="btn btn-danger">Reset</button>
                    </div>
                </form>
            </div>
            <a href="PinjamBuku?action=cari" >Cari Buku</a>
        </div>
        
        <script type="text/javascript" src="datepicker/modul/date_picker_bootstrap/jquery/jquery-1.8.3.min.js" charset="UTF-8"></script>
        <script type="text/javascript" src="datepicker/modul/date_picker_bootstrap/bootstrap/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="datepicker/modul/date_picker_bootstrap/js/bootstrap-datetimepicker.js" charset="UTF-8"></script>
        <script type="text/javascript" src="datepicker/modul/date_picker_bootstrap/js/locales/bootstrap-datetimepicker.id.js" charset="UTF-8"></script>
        <script type="text/javascript">
            $('.form_date').datetimepicker({
                language:  'id',
                weekStart: 1,
                todayBtn:  1,
                autoclose: 1,
                todayHighlight: 1,
                startView: 2,
                minView: 2,
                forceParse: 0
               });
       </script>
    </body>
</html>
