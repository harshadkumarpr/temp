$(document).ready(
    ()=>{
        $.get("https://jsonplaceholder.typicode.com/photos", function(data, status){
            console.log(data);
            //console.log(data[0].title);
            for(var i=0;i<6;i++)
            {
                $('.grid').append('<div id="div'+i+'" class="grid-item" ></div>');
                $('#div'+i+'').append("<img  src="+data[i].thumbnailUrl+" />");
                $('#div'+i+'').append("<p>"+data[i].title+"</p>");
                $('#div'+i+'').append("<button>Add to Cart</button>");
            }
            var selectedDiv=document.querySelectorAll('div');

            var model=document.getElementById("myModal");
            console.log("Model:",model);

            var span=$(".close")[0];
            $("button").click(function(){
                
                // model.css("display","block");
                model.style.display="block";
            })

            span.onclick=function(){
                // model.css("display","none");
                model.style.display="none";
            }


        $(window).click(function(event) {
            if(event.target == model){
                console.log("jAI ")
                model.style.display="none";
            }
        });

        })
        
    }
) 

