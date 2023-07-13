            
            $(document).ready(fuction(){
                var stopauto;
                fuction showWindow(){
                    $('#main').show();
                    $('html body').css("overflow",hidden);
                    stopauto=setTimeout(hideWindow,5000);
                }
             $(document).hideWindow(){
                 $('main').show();
                 $('html body').css('overflow','hidden');
             }
             setTimeout(showWindow,10000);
             
             $("#close-btn").click(function(){
                 hideWindow();
                 cleartimeout(stopauto);
             })
            })
       