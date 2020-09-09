from bs4 import BeautifulSoup
import urllib.error, urllib.request, urllib.parse
import xml.etree.ElementTree as ET

url = input('Enter URL: ')
html = urllib.request.urlopen(url).read()
print('Retrieving', url)
print('Retrieved', len(html), 'characters')
print(html.decode())
tree = ET.fromstring(html)
soup = BeautifulSoup(html, 'html.parser')
count = soup.find_all('count')
total =  sum(int(i.text) for i in count)
print(f'The sum of all count in doc are: {total}')