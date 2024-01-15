class BirthMonth:

    def main(self):
        group1 = set()
        group2 = set()
        self_set = set()

        for i in range(3):
            b_month = input(f"Enter Birth month {i + 1}: ")
            group1.add(b_month)

        for i in range(3):
            b_month = input(f"Enter Birth month {i + 1}: ")
            group2.add(b_month)

        print("Group 1:", group1)
        print("Group 2:", group2)

        s = input("Enter Birth month: ")
        self_set.add(s)

        union_set = set(group1)
        inter_set = set(group1)
        diff_set = set(group1)

        union_set.update(group2)
        inter_set.intersection_update(group2)
        diff_set.difference_update(group2)

        print("Union:", union_set)
        print("Intersection:", inter_set)
        print("Difference:", diff_set)

        if s in union_set or s in inter_set or s in diff_set:
            print("You have the same birth month with one of your classmates.")
        else:
            print("You don't have the same birth month with one of your classmates.")


if __name__ == "__main__":
    birth_month = BirthMonth()
    birth_month.main()
