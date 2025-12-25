# Number Guessing Game

使用 Java 撰寫的主控台猜數字遊戲

## Introduction

這是桌遊常見的猜數字遊戲(終極密碼)，並且也加入了其他兩位電腦選手，

分別是只猜奇數的電腦選手及只猜偶數的電腦選手，

遊戲開始時，系統會隨機產生一個數字，每次猜測後，系統會給予回饋縮小範圍，直到猜對為止。

## Features

- 產生1~100中的其中一個數字
- 使用者可輸入玩家名稱、猜數字
- 系統提供回饋縮小範圍（例如：0～50、25～75...等）


## Project Structure

src/     
├── Main.java     
├── game/    
│ └── Game.java    
└── computer/    
　├── AI.java    
　├── EvenAI.java    
　└── OddAI.java    


## How to Run

1. 下載專案
   git clone https://github.com/rennychen/guessNumWithAI.git    
2. 編譯程式    
  javac src/Main.java    
3.執行程式    
   java Main     


## 使用技術

設計說明（OOP）  
本專案中的電腦玩家（Computer AI）使用繼承與抽象類別進行設計。
AI 為抽象類別（abstract class），定義共通的行為    
EvenAI 與 OddAI 繼承 AI，實作不同的猜數策略    
透過多型（Polymorphism），遊戲邏輯可彈性切換不同 AI 實作    
此設計讓未來新增新的 AI 類型時，不需修改既有遊戲流程程式碼。    

