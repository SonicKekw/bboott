package qqwwee;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import qqwwee.q.TelegramBot;

public class Main {
    public static void main(String[] args) throws TelegramApiException {
        TelegramBotsApi TelegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
        TelegramBotsApi.registerBot(new TelegramBot());
    }
}