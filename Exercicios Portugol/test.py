import requests
url = 'https://qz.com/africa/latest/'

req = requests.get(url)

print(req)

html = req.text
soup = BeautifulSoup(html, 'html.parser')
find_data = soup.find_all('h3')
print(find_data)
for h3 in find_data:
    print(title.next_element)

    soup1.find('h3', attrs={'titles'})
print(soup1.find())