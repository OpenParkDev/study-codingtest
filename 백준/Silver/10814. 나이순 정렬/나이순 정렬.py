import sys

def get_answer():
    members_list = sys.stdin.readlines()[1:]
    members_list.sort(key=lambda member: int(member.split()[0]))
    sys.stdout.write("".join(members_list))

get_answer()