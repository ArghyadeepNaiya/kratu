word=input()
a=word.split()
c=len(a)
print(c)
d=[]
for i in range (c+1):
    if len(a[i])>len(a[i+1]):
        d.append(a[i-1])
    else:
        d.append(a[i])
print(i)
print(d)