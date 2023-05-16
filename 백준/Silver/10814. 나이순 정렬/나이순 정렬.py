import sys

def get_age(member):
    age, name = member.split()
    return int(age)

def get_answer():
    members_list = sys.stdin.readlines()[1:]
    members_list.sort(key=lambda member: get_age(member))
    sys.stdout.write("".join(members_list))

get_answer()