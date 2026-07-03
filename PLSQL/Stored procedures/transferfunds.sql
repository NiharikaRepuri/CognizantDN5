CREATE OR REPLACE PROCEDURE TransferFunds
(
    p_source_acc IN NUMBER,
    p_target_acc IN NUMBER,
    p_amount IN NUMBER
)
IS
    v_balance NUMBER;
BEGIN

    SELECT Balance
    INTO v_balance
    FROM Accounts
    WHERE AccountID = p_source_acc;

    IF v_balance >= p_amount THEN

        UPDATE Accounts
        SET Balance = Balance - p_amount
        WHERE AccountID = p_source_acc;

        UPDATE Accounts
        SET Balance = Balance + p_amount
        WHERE AccountID = p_target_acc;

        COMMIT;

        DBMS_OUTPUT.PUT_LINE
        ('Transfer Successful');

    ELSE

        DBMS_OUTPUT.PUT_LINE
        ('Insufficient Balance');

    END IF;

END;