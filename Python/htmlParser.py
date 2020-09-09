import urllib.error, urllib.request, urllib.parse
from bs4 import BeautifulSoup

url = input('Enter URL: ')
position = int(input('Enter Position: '))-1
count = int(input('Enter Count: '))
for i in range(count):
    html = urllib.request.urlopen(url).read()
    soup = BeautifulSoup(html,'html.parser')
    href = soup('a')
    link = href[position].get('href',None)
    url = link
    contents = href[position].contents[0]
print(contents)