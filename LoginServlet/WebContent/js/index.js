//create new event
var body = new Event('body');

//check if body is available
var intID = setInterval(function(){
	if(document.body){
		document.dispatchEvent(body);
		clearInterval(intID);
	}
}, 10);

document.addEventListener('body', function(){
	console.log('Body is ready');
});

//create new HTML fragment
var newFragment = function(html){
	var fragment = document.createDocumentFragment();
	var temp = document.createElement('div');
	
	temp.innerHTML = html;
	
	while(temp.firstChild)
		fragment.appendChild(temp.firstChild);
	
	return fragment;
};

	var preloader = newFragment('<div align="center" id="preloader" class="overlay"><img id="loader" src="img/ruby.GIF" class="spinner"></div>');

//insert preloader when body is ready
	document.addEventListener('body', function(){
		document.body.insertBefore(preloader, document.body.childNodes[0]);
});

//remove preloader markup
var removePreloader = function(){
	var preloader = document.getElementById('preloader');
	preloader.style.opacity = 1;
	
	var animationID = setInterval(function(){
		preloader.style.opacity -= 0.05;
		if(preloader.style.opacity <= 0.2){
			preloader.parentNode.removeChild(preloader);
			clearInterval(animationID);
		}
	}, 70);
};

//when page is fully loaded remove preloader
window.addEventListener('load', removePreloader);
