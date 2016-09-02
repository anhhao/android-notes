//Handle menu action inside fragment
//Inside onCreate of this fragment: 
setHasOptionsMenu(true) 

//Build URL with parameter (not concatenate strings)
//URL url = new URL("http://api.openweathermap.org/data/2.5/forecast/daily?q=94043&APPID=85cf992512a687d70fae2e87edef2a4e&mode=json&cnt=7&units=metric");
Uri.Builder builder = new Uri.Builder();
builder.scheme("http")
	.authority("api.openweathermap.org")
	.appendPath("data").appendPath("2.5").appendPath("forecast").appendPath("daily")
	.appendQueryParameter("q", zipCode)
	.appendQueryParameter("APPID", "85cf992512a687d70fae2e87edef2a4e")
	.appendQueryParameter("mode", "json")
	.appendQueryParameter("cnt", "7")
	.appendQueryParameter("units", "metric");
URL url = new URL(builder.build().toString());