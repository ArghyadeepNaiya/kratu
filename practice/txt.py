file=open('file.txt')
rae=file.readlines()
num=(len(rae))
for i in rae[0:num-1]:
    list(i)
    name=i[0]+str(len(i)-1)
    print(name)
for j in rae[num-1:num]:
    list(j)
    names=j[0]+str(len(j))
    print(names)