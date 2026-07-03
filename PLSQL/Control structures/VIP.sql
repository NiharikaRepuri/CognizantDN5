DECLARE
    CURSOR vip_cur IS
        SELECT CustomerID, Balance
        FROM Customers;

BEGIN
    FOR rec IN vip_cur LOOP

        IF rec.Balance > 10000 THEN

            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE CustomerID = rec.CustomerID;

            DBMS_OUTPUT.PUT_LINE
            ('VIP Status Granted to Customer ID: ' ||
             rec.CustomerID);

        END IF;

    END LOOP;

    COMMIT;
END;