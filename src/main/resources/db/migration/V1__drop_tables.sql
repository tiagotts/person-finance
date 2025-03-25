-- Drop tables in correct order based on foreign key dependencies

-- First drop tables with foreign key constraints
DROP TABLE IF EXISTS personfinance.transactions;
DROP TABLE IF EXISTS personfinance.subcategories;
DROP TABLE IF EXISTS personfinance.categories;
DROP TABLE IF EXISTS personfinance.cards;
DROP TABLE IF EXISTS personfinance.users;