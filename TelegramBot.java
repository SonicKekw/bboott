package qqwwee.q;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class TelegramBot extends TelegramLongPollingBot{
    @Override
    public String getBotToken() {
        return "6955952933:AAF_o8Z2ZC8ffzc5xmStXXkjGp9V4gFKzIc";
    }

    @Override
    public void onUpdateReceived(Update update) {

        String chatId = update.getMessage().getChatId().toString();
        String text = update.getMessage().getText();
        SendMessage SendMessage = new SendMessage();
        SendMessage.setChatId(chatId);
        SendMessage.setText(text);

        try {
            this.execute(SendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public String getBotUsername() {
        return "dzpomdk_bot";
    }
}
