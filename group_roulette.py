import random as roulette 

#gather data
names = input ("Enter the last name (use comma ',' to seperate): ").split(",")
group_size = int(input("Enter how many person in group are (2 or more ): "))

#randomizing the names data
roulette.shuffle(names)

#control and distribute of data
grouped = [names[name:name + group_size] for name in range(0,len(names), group_size)]

comma = ", "
plus_group = 1

for groups in grouped:
    if len(groups) == group_size:
        print(f"Group {plus_group}: {comma.join(groups)} ")
    else:
        print(f"No groups are: {comma.join(groups)}")