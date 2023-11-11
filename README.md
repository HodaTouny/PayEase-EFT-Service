# PayEase-EFT-Service

## Description

PayEase is a comprehensive financial platform designed to simplify money transfers and streamline bill payments. This system empowers users to transfer funds to other PayEase accounts, bank accounts, and mobile wallets. Users can also conveniently settle utility bills for services such as Gas, Electricity, and Water. PayEase supports various wallet providers, including telecommunication companies, banks, and electronic payment firms.

## Requirements

### User

1. **Signup Process:**
   - Users can register in two ways:
     - Register using their bank account and the registered mobile number on the bank. The app verifies the information through the bank API.
     - Register using their mobile number with a wallet provided by a wallet provider (e.g., Vodafone Cash, CIB). The mobile number is verified with the wallet provider. After verification, the user must enter a unique username and a complex password.
   - For both registration methods, the system verifies that the user owns the mobile number by sending an OTP and confirming it.

2. **User Authentication:**
   - Users can sign in to the system using their PayEase username and password.
   - Upon logging in, the user profile is loaded based on their registration type.

3. **Transaction Options:**
   - Both types of users (bank account and wallet) have the following options:
     - Transfer to a wallet using the recipient's mobile number.
     - Transfer to another PayEase account.
     - Inquire about their account balance.
     - Pay bills.

4. **Bank Account Specifics:**
   - Transferring to a bank account is only valid for users registered using their bank account.

5. **Utility Bill Payment:**
   - Utility bill payment involves creating and deducting the bill amount from the user’s account.
   - The system supports the creation and payment of three bill types: Gas, Electricity, and Water.
   - Bill contents vary based on the bill types, and assumptions about bill details should be made.

## Implementation Notes

- **Design Patterns and SOLID Principles:**
  - PayEase has been developed following established design patterns to enhance code organization and maintainability.
  - The SOLID principles have been adhered to, promoting a modular and scalable architecture.
