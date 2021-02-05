<%-- 
    Document   : search
    Created on : Feb 3, 2021, 1:21:47 PM
    Author     : akunf
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cari Buku</title>
        <link href="datepicker/modul/date_picker_bootstrap/bootstrap.min.css" rel="stylesheet" media="screen">
        <link href="datepicker/modul/date_picker_bootstrap/bootstrap-datetimepicker.min.css" rel="stylesheet" media="screen">
    </head>
    <body>
        <div class="container">
            <div class="col-lg-4">  
                <div class="page-header">
                    <h3>Form Cari Buku</h3>
                </div>
                <form role="form" class="form-horizontal" method="GET" action="Buku">
                    <div class="form-group">
                        <label>ID Buku</label>
                            <input type="text" name="cari" class="form-control">
                    </div>
                    <input type="hidden" name="action" value="search"><br/><br/>
                    <div class="form-group">
                        <button type="submit" class="btn btn-primary">Cari Buku</button>
                        <button type="reset" class="btn btn-danger">Reset</button>
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>