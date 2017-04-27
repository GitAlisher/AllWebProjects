-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Хост: 127.0.0.1
-- Время создания: Окт 17 2016 г., 19:55
-- Версия сервера: 10.1.13-MariaDB
-- Версия PHP: 5.6.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- База данных: `users`
--

-- --------------------------------------------------------

--
-- Структура таблицы `question`
--

CREATE TABLE `question` (
  `ID` int(20) NOT NULL,
  `Context` varchar(400) NOT NULL,
  `A` varchar(200) NOT NULL,
  `B` varchar(200) NOT NULL,
  `C` varchar(200) NOT NULL,
  `D` varchar(200) NOT NULL,
  `Answer` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Дамп данных таблицы `question`
--

INSERT INTO `question` (`ID`, `Context`, `A`, `B`, `C`, `D`, `Answer`) VALUES
(1, '	\r\nA sum of money at simple interest amounts to Rs. 815 in 3 years and to Rs. 854 in 4 years. The sum is:', 'Rs.650', 'Rs.670', 'Rs.698', 'Rs.700', 'C'),
(2, 'Mr. Thomas invested an amount of Rs. 13,900 divided in two different schemes A and B at the simple interest rate of 14% p.a. and 11% p.a. respectively. If the total amount of simple interest earned in 2 years be Rs. 3508, what was the amount invested in Scheme B?', 'Rs.6400', 'Rs.6500', 'Rs.6200', 'Rs.7500', 'A'),
(3, 'A sum fetched a total simple interest of Rs. 4016.25 at the rate of 9 p.c.p.a. in 5 years. What is the sum?', 'Rs.4462.50', 'Rs.8032.50', 'Rs.8900', 'Rs.8925', 'D'),
(4, 'How much time will it take for an amount of Rs. 450 to yield Rs. 81 as interest at 4.5% per annum of simple interest?', '3.5years', '4years', '4.5 years', '5years', 'B'),
(5, 'Reena took a loan of Rs. 1200 with simple interest for as many years as the rate of interest. If she paid Rs. 432 as interest at the end of the loan period, what was the rate of interest?', '3.6', '6', '18', 'Unknown', 'B');

-- --------------------------------------------------------

--
-- Структура таблицы `rating`
--

CREATE TABLE `rating` (
  `ID` int(5) NOT NULL,
  `Name` varchar(15) NOT NULL,
  `Score` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Дамп данных таблицы `rating`
--

INSERT INTO `rating` (`ID`, `Name`, `Score`) VALUES
(1, 'qqwertt', 1000000),
(2, 'Qwerty', 800000),
(3, 'Alisher', 1000000),
(4, 'Aidar', 600000),
(5, 'Victor', 200000),
(6, 'Alish', 0);

-- --------------------------------------------------------

--
-- Структура таблицы `user`
--

CREATE TABLE `user` (
  `ID` int(20) NOT NULL,
  `IPN` int(20) NOT NULL,
  `Password` varchar(50) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Participate` tinyint(1) DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Дамп данных таблицы `user`
--

INSERT INTO `user` (`ID`, `IPN`, `Password`, `Name`, `Participate`) VALUES
(1, 19539, 'qwerty123', 'Alish', 1),
(2, 19540, 'qwerty1234', 'Qwerty', 1),
(5, 19538, 'qwerty', 'Ivan', 1),
(6, 19543, '123456789', 'Ivan', 1),
(7, 19535, 'qwerty', 'Asdd', 1),
(8, 100, '123', 'qwerty', 1),
(9, 101, '123', 'xcvz', 1),
(10, 102, '123', 'asd', 1),
(11, 103, '123', 'qqwertt', 1),
(12, 19544, '123', 'Bot', 1),
(13, 104, '132', 'Bot2', 1),
(14, 111, '123', 'Alisher', 1),
(15, 112, '123', 'Aidar', 1),
(16, 113, '123', 'Victor', 1);

--
-- Индексы сохранённых таблиц
--

--
-- Индексы таблицы `question`
--
ALTER TABLE `question`
  ADD PRIMARY KEY (`ID`);

--
-- Индексы таблицы `rating`
--
ALTER TABLE `rating`
  ADD PRIMARY KEY (`ID`);

--
-- Индексы таблицы `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT для сохранённых таблиц
--

--
-- AUTO_INCREMENT для таблицы `question`
--
ALTER TABLE `question`
  MODIFY `ID` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT для таблицы `rating`
--
ALTER TABLE `rating`
  MODIFY `ID` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT для таблицы `user`
--
ALTER TABLE `user`
  MODIFY `ID` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
