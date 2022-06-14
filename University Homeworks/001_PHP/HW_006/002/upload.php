<?php
if (isset($_FILES['upload']) && $_FILES["upload"]["error"] == 0) {

    $file_name = $_FILES['upload']['name'];
    $file_type = $_FILES['upload']['type'];
    $file_size = $_FILES['upload']['size'];
    $file_tmp = $_FILES['upload']['tmp_name'];

    $filename = pathinfo($file_name);
    $e = strtolower($filename['extension']);

    if ($e === 'txt' || $e === 'png' || $e === 'jpg' || $e === 'jpeg') {
        if ($file_size <= 20000000) {

            $uploadPath = '002/upload/data.txt';
            $uploadedFile = $uploadPath . basename($file_name);
            if (move_uploaded_file($file_tmp, $uploadedFile)) {
                print("Uploaded");
            } else {
                print("Not uploaded.");
            }
        } else {
            print("File must be up to 20000000 bytes ~ 20000 KB ~ 20 MB");
        }
    } else {
        print("Only txt, png, jpg or jpeg");
    }
}
