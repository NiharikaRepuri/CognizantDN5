DECLARE
    CURSOR cust_cur IS
        SELECT c.CustomerID, c.Age, l.LoanID
        FROM Customers c
        JOIN Loans l
        ON c.CustomerID = l.CustomerID;

BEGIN
    FOR rec IN cust_cur LOOP

        IF rec.Age > 60 THEN

            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE LoanID = rec.LoanID;

            DBMS_OUTPUT.PUT_LINE
            ('Discount Applied for Customer ID: ' ||
             rec.CustomerID);

        END IF;

    END LOOP;

    COMMIT;
END;