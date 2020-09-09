import json
import urllib.request,urllib.parse,urllib.error

count = 0
url = input("Enter Url: ")
print ("retrieving ",url, "Please Stand by.")
data=urllib.request.urlopen(url).read().decode()
info = json.loads(data)
for item in info["comments"]:
	number = int(item["count"])
	count += number
print (count)