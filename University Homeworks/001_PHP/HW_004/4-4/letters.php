<html> 
    <head>
        <title>20621620</title>
    </head>
    <body>
        <?php
                require("data.php");
                foreach($people as $key => $hora){
                    $keyN = $place[$key];
                    if($keyN <> ""){
                        foreach ($hora as $key1 => $info) {
                            $str = "Уважаеми (a), $info";                            
                        }
                        $str .= "<br> Имаме удоволствието да Ви поканим на ".$events[$keyN];
                        switch($keyN){
                            case "i": $str .= "<br> Бъдете 10 минути преди откриването!";
                            break;
                            case "p": $str .= "<br> Не забравяйте да донесете подарък!";
                            break;
                            case "s": $str .= "<br> Моля, потвърдете Вашето участие по телефона!";
                            break;
                        }
                        $str .= "<br>". SIGN . "<hr>";
                        echo $str;
                    }
                }
        ?>
    </body></html>