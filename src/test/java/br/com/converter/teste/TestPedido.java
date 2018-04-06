package br.com.converter.teste;

import br.com.converter.entidade.PedidoMercadoLivre;
import br.com.converter.util.ConverterJsonObjetoUtil;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class TestPedido extends Assert {

    @Test
    public void converterJsonParaObjeto() throws IOException {
        JsonArray jsonString = ConverterJsonObjetoUtil.getPropriedadeJson(retornoJson(), "results");
        List<PedidoMercadoLivre> pedidoMercadoLivreList = new ArrayList<>();
        for (JsonElement o : jsonString) {
            PedidoMercadoLivre pe = (PedidoMercadoLivre) ConverterJsonObjetoUtil.jsonParaObjeto(o.toString(), PedidoMercadoLivre.class);
            pedidoMercadoLivreList.add(pe);
        }
        Assert.assertNotNull(pedidoMercadoLivreList);
    }


    private String retornoJson() {
        return "{\n" +
                "    \"query\": \"\",\n" +
                "    \"results\": [\n" +
                "        {\n" +
                "            \"id\": 1676920826,\n" +
                "            \"comments\": null,\n" +
                "            \"status\": \"paid\",\n" +
                "            \"status_detail\": {\n" +
                "                \"code\": \"item_price_restriction\",\n" +
                "                \"description\": null\n" +
                "            },\n" +
                "            \"date_created\": \"2018-04-04T15:04:59.000-04:00\",\n" +
                "            \"date_closed\": \"2018-04-04T15:11:26.000-04:00\",\n" +
                "            \"expiration_date\": \"2018-04-15T16:32:48.000-04:00\",\n" +
                "            \"date_last_updated\": \"2018-04-05T12:27:36.377Z\",\n" +
                "            \"hidden_for_seller\": false,\n" +
                "            \"currency_id\": \"BRL\",\n" +
                "            \"order_items\": [\n" +
                "                {\n" +
                "                    \"item\": {\n" +
                "                        \"seller_custom_field\": null,\n" +
                "                        \"condition\": \"used\",\n" +
                "                        \"category_id\": \"MLB3530\",\n" +
                "                        \"variation_id\": null,\n" +
                "                        \"variation_attributes\": [],\n" +
                "                        \"warranty\": null,\n" +
                "                        \"id\": \"MLB1006547759\",\n" +
                "                        \"title\": \"Produto De Item De Teste!\"\n" +
                "                    },\n" +
                "                    \"quantity\": 1,\n" +
                "                    \"differential_pricing_id\": 33426180,\n" +
                "                    \"sale_fee\": 0,\n" +
                "                    \"listing_type_id\": \"free\",\n" +
                "                    \"base_currency_id\": null,\n" +
                "                    \"unit_price\": 2,\n" +
                "                    \"full_unit_price\": 2,\n" +
                "                    \"base_exchange_rate\": null,\n" +
                "                    \"currency_id\": \"BRL\",\n" +
                "                    \"manufacturing_days\": null\n" +
                "                }\n" +
                "            ],\n" +
                "            \"total_amount\": 2,\n" +
                "            \"mediations\": [],\n" +
                "            \"payments\": [\n" +
                "                {\n" +
                "                    \"id\": 3597173112,\n" +
                "                    \"order_id\": 1676920826,\n" +
                "                    \"payer_id\": 312388903,\n" +
                "                    \"collector\": {\n" +
                "                        \"id\": 312388855\n" +
                "                    },\n" +
                "                    \"currency_id\": \"BRL\",\n" +
                "                    \"status\": \"rejected\",\n" +
                "                    \"status_code\": null,\n" +
                "                    \"status_detail\": \"cc_rejected_bad_filled_card_number\",\n" +
                "                    \"transaction_amount\": 2,\n" +
                "                    \"shipping_cost\": 0,\n" +
                "                    \"overpaid_amount\": 0,\n" +
                "                    \"total_paid_amount\": 2,\n" +
                "                    \"marketplace_fee\": 0,\n" +
                "                    \"coupon_amount\": 0,\n" +
                "                    \"date_created\": \"2018-04-04T15:05:00.000-04:00\",\n" +
                "                    \"date_last_modified\": \"2018-04-04T15:05:01.000-04:00\",\n" +
                "                    \"card_id\": null,\n" +
                "                    \"reason\": \"Produto De Item De Teste!\",\n" +
                "                    \"activation_uri\": null,\n" +
                "                    \"payment_method_id\": \"visa\",\n" +
                "                    \"installments\": 1,\n" +
                "                    \"issuer_id\": \"25\",\n" +
                "                    \"atm_transfer_reference\": {\n" +
                "                        \"company_id\": null,\n" +
                "                        \"transaction_id\": \"1234567\"\n" +
                "                    },\n" +
                "                    \"coupon_id\": null,\n" +
                "                    \"operation_type\": \"regular_payment\",\n" +
                "                    \"payment_type\": \"credit_card\",\n" +
                "                    \"available_actions\": [],\n" +
                "                    \"installment_amount\": 2,\n" +
                "                    \"deferred_period\": null,\n" +
                "                    \"date_approved\": null,\n" +
                "                    \"authorization_code\": null,\n" +
                "                    \"transaction_order_id\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 3597180536,\n" +
                "                    \"order_id\": 1676920826,\n" +
                "                    \"payer_id\": 312388903,\n" +
                "                    \"collector\": {\n" +
                "                        \"id\": 312388855\n" +
                "                    },\n" +
                "                    \"currency_id\": \"BRL\",\n" +
                "                    \"status\": \"approved\",\n" +
                "                    \"status_code\": null,\n" +
                "                    \"status_detail\": \"accredited\",\n" +
                "                    \"transaction_amount\": 2,\n" +
                "                    \"shipping_cost\": 0,\n" +
                "                    \"overpaid_amount\": 0,\n" +
                "                    \"total_paid_amount\": 2,\n" +
                "                    \"marketplace_fee\": 0,\n" +
                "                    \"coupon_amount\": 0,\n" +
                "                    \"date_created\": \"2018-04-04T15:11:25.000-04:00\",\n" +
                "                    \"date_last_modified\": \"2018-04-05T12:27:29.000-04:00\",\n" +
                "                    \"card_id\": null,\n" +
                "                    \"reason\": \"Produto De Item De Teste!\",\n" +
                "                    \"activation_uri\": null,\n" +
                "                    \"payment_method_id\": \"visa\",\n" +
                "                    \"installments\": 1,\n" +
                "                    \"issuer_id\": \"25\",\n" +
                "                    \"atm_transfer_reference\": {\n" +
                "                        \"company_id\": null,\n" +
                "                        \"transaction_id\": \"1234567\"\n" +
                "                    },\n" +
                "                    \"coupon_id\": null,\n" +
                "                    \"operation_type\": \"regular_payment\",\n" +
                "                    \"payment_type\": \"credit_card\",\n" +
                "                    \"available_actions\": [\n" +
                "                        \"refund\"\n" +
                "                    ],\n" +
                "                    \"installment_amount\": 2,\n" +
                "                    \"deferred_period\": null,\n" +
                "                    \"date_approved\": \"2018-04-04T15:11:26.000-04:00\",\n" +
                "                    \"authorization_code\": \"1234567\",\n" +
                "                    \"transaction_order_id\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 3597174266,\n" +
                "                    \"order_id\": 1676920826,\n" +
                "                    \"payer_id\": 312388903,\n" +
                "                    \"collector\": {\n" +
                "                        \"id\": 312388855\n" +
                "                    },\n" +
                "                    \"currency_id\": \"BRL\",\n" +
                "                    \"status\": \"rejected\",\n" +
                "                    \"status_code\": null,\n" +
                "                    \"status_detail\": \"cc_rejected_other_reason\",\n" +
                "                    \"transaction_amount\": 2,\n" +
                "                    \"shipping_cost\": 0,\n" +
                "                    \"overpaid_amount\": 0,\n" +
                "                    \"total_paid_amount\": 2,\n" +
                "                    \"marketplace_fee\": 0,\n" +
                "                    \"coupon_amount\": 0,\n" +
                "                    \"date_created\": \"2018-04-04T15:05:57.000-04:00\",\n" +
                "                    \"date_last_modified\": \"2018-04-04T15:05:57.000-04:00\",\n" +
                "                    \"card_id\": null,\n" +
                "                    \"reason\": \"Produto De Item De Teste!\",\n" +
                "                    \"activation_uri\": null,\n" +
                "                    \"payment_method_id\": \"visa\",\n" +
                "                    \"installments\": 1,\n" +
                "                    \"issuer_id\": \"25\",\n" +
                "                    \"atm_transfer_reference\": {\n" +
                "                        \"company_id\": null,\n" +
                "                        \"transaction_id\": \"3354277\"\n" +
                "                    },\n" +
                "                    \"coupon_id\": null,\n" +
                "                    \"operation_type\": \"regular_payment\",\n" +
                "                    \"payment_type\": \"credit_card\",\n" +
                "                    \"available_actions\": [],\n" +
                "                    \"installment_amount\": 2,\n" +
                "                    \"deferred_period\": null,\n" +
                "                    \"date_approved\": null,\n" +
                "                    \"authorization_code\": null,\n" +
                "                    \"transaction_order_id\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 3596885248,\n" +
                "                    \"order_id\": 1676920826,\n" +
                "                    \"payer_id\": 312388903,\n" +
                "                    \"collector\": {\n" +
                "                        \"id\": 312388855\n" +
                "                    },\n" +
                "                    \"currency_id\": \"BRL\",\n" +
                "                    \"status\": \"rejected\",\n" +
                "                    \"status_code\": null,\n" +
                "                    \"status_detail\": \"cc_rejected_call_for_authorize\",\n" +
                "                    \"transaction_amount\": 2,\n" +
                "                    \"shipping_cost\": 0,\n" +
                "                    \"overpaid_amount\": 0,\n" +
                "                    \"total_paid_amount\": 2,\n" +
                "                    \"marketplace_fee\": 0,\n" +
                "                    \"coupon_amount\": 0,\n" +
                "                    \"date_created\": \"2018-04-04T15:08:09.000-04:00\",\n" +
                "                    \"date_last_modified\": \"2018-04-04T15:08:09.000-04:00\",\n" +
                "                    \"card_id\": null,\n" +
                "                    \"reason\": \"Produto De Item De Teste!\",\n" +
                "                    \"activation_uri\": null,\n" +
                "                    \"payment_method_id\": \"master\",\n" +
                "                    \"installments\": 1,\n" +
                "                    \"issuer_id\": \"24\",\n" +
                "                    \"atm_transfer_reference\": {\n" +
                "                        \"company_id\": null,\n" +
                "                        \"transaction_id\": \"085690\"\n" +
                "                    },\n" +
                "                    \"coupon_id\": null,\n" +
                "                    \"operation_type\": \"regular_payment\",\n" +
                "                    \"payment_type\": \"credit_card\",\n" +
                "                    \"available_actions\": [],\n" +
                "                    \"installment_amount\": 2,\n" +
                "                    \"deferred_period\": null,\n" +
                "                    \"date_approved\": null,\n" +
                "                    \"authorization_code\": null,\n" +
                "                    \"transaction_order_id\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 3597175437,\n" +
                "                    \"order_id\": 1676920826,\n" +
                "                    \"payer_id\": 312388903,\n" +
                "                    \"collector\": {\n" +
                "                        \"id\": 312388855\n" +
                "                    },\n" +
                "                    \"currency_id\": \"BRL\",\n" +
                "                    \"status\": \"rejected\",\n" +
                "                    \"status_code\": null,\n" +
                "                    \"status_detail\": \"cc_rejected_call_for_authorize\",\n" +
                "                    \"transaction_amount\": 2,\n" +
                "                    \"shipping_cost\": 0,\n" +
                "                    \"overpaid_amount\": 0,\n" +
                "                    \"total_paid_amount\": 2,\n" +
                "                    \"marketplace_fee\": 0,\n" +
                "                    \"coupon_amount\": 0,\n" +
                "                    \"date_created\": \"2018-04-04T15:06:57.000-04:00\",\n" +
                "                    \"date_last_modified\": \"2018-04-04T15:06:57.000-04:00\",\n" +
                "                    \"card_id\": null,\n" +
                "                    \"reason\": \"Produto De Item De Teste!\",\n" +
                "                    \"activation_uri\": null,\n" +
                "                    \"payment_method_id\": \"master\",\n" +
                "                    \"installments\": 1,\n" +
                "                    \"issuer_id\": \"24\",\n" +
                "                    \"atm_transfer_reference\": {\n" +
                "                        \"company_id\": null,\n" +
                "                        \"transaction_id\": \"087102\"\n" +
                "                    },\n" +
                "                    \"coupon_id\": null,\n" +
                "                    \"operation_type\": \"regular_payment\",\n" +
                "                    \"payment_type\": \"credit_card\",\n" +
                "                    \"available_actions\": [],\n" +
                "                    \"installment_amount\": 2,\n" +
                "                    \"deferred_period\": null,\n" +
                "                    \"date_approved\": null,\n" +
                "                    \"authorization_code\": null,\n" +
                "                    \"transaction_order_id\": null\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 3597177281,\n" +
                "                    \"order_id\": 1676920826,\n" +
                "                    \"payer_id\": 312388903,\n" +
                "                    \"collector\": {\n" +
                "                        \"id\": 312388855\n" +
                "                    },\n" +
                "                    \"currency_id\": \"BRL\",\n" +
                "                    \"status\": \"rejected\",\n" +
                "                    \"status_code\": null,\n" +
                "                    \"status_detail\": \"cc_rejected_call_for_authorize\",\n" +
                "                    \"transaction_amount\": 2,\n" +
                "                    \"shipping_cost\": 0,\n" +
                "                    \"overpaid_amount\": 0,\n" +
                "                    \"total_paid_amount\": 2,\n" +
                "                    \"marketplace_fee\": 0,\n" +
                "                    \"coupon_amount\": 0,\n" +
                "                    \"date_created\": \"2018-04-04T15:08:30.000-04:00\",\n" +
                "                    \"date_last_modified\": \"2018-04-04T15:08:30.000-04:00\",\n" +
                "                    \"card_id\": null,\n" +
                "                    \"reason\": \"Produto De Item De Teste!\",\n" +
                "                    \"activation_uri\": null,\n" +
                "                    \"payment_method_id\": \"master\",\n" +
                "                    \"installments\": 1,\n" +
                "                    \"issuer_id\": \"24\",\n" +
                "                    \"atm_transfer_reference\": {\n" +
                "                        \"company_id\": null,\n" +
                "                        \"transaction_id\": \"089124\"\n" +
                "                    },\n" +
                "                    \"coupon_id\": null,\n" +
                "                    \"operation_type\": \"regular_payment\",\n" +
                "                    \"payment_type\": \"credit_card\",\n" +
                "                    \"available_actions\": [],\n" +
                "                    \"installment_amount\": 2,\n" +
                "                    \"deferred_period\": null,\n" +
                "                    \"date_approved\": null,\n" +
                "                    \"authorization_code\": null,\n" +
                "                    \"transaction_order_id\": null\n" +
                "                }\n" +
                "            ],\n" +
                "            \"shipping\": {\n" +
                "                \"substatus\": null,\n" +
                "                \"status\": \"to_be_agreed\",\n" +
                "                \"id\": null,\n" +
                "                \"service_id\": null,\n" +
                "                \"currency_id\": null,\n" +
                "                \"shipping_mode\": null,\n" +
                "                \"shipment_type\": null,\n" +
                "                \"sender_id\": null,\n" +
                "                \"picking_type\": null,\n" +
                "                \"date_created\": null,\n" +
                "                \"cost\": null,\n" +
                "                \"date_first_printed\": null\n" +
                "            },\n" +
                "            \"order_request\": {\n" +
                "                \"change\": null,\n" +
                "                \"return\": null\n" +
                "            },\n" +
                "            \"pickup_id\": null,\n" +
                "            \"buyer\": {\n" +
                "                \"id\": 312388903,\n" +
                "                \"nickname\": \"TETE2551691\",\n" +
                "                \"email\": \"ttest.wb84r71+2-oge3donrzgiydqnrt@mail.mercadolivre.com\",\n" +
                "                \"phone\": {\n" +
                "                    \"area_code\": \"01\",\n" +
                "                    \"extension\": \"\",\n" +
                "                    \"number\": \"1111-1111\",\n" +
                "                    \"verified\": false\n" +
                "                },\n" +
                "                \"alternative_phone\": {\n" +
                "                    \"area_code\": \"\",\n" +
                "                    \"extension\": \"\",\n" +
                "                    \"number\": \"\"\n" +
                "                },\n" +
                "                \"first_name\": \"Test\",\n" +
                "                \"last_name\": \"Test\",\n" +
                "                \"billing_info\": {\n" +
                "                    \"doc_type\": null,\n" +
                "                    \"doc_number\": null\n" +
                "                }\n" +
                "            },\n" +
                "            \"seller\": {\n" +
                "                \"id\": 312388855,\n" +
                "                \"nickname\": \"TT718371\",\n" +
                "                \"email\": \"ttest.k27yp4t+2-oge3donrzgiydqnrz@mail.mercadolivre.com\",\n" +
                "                \"phone\": {\n" +
                "                    \"area_code\": \"01\",\n" +
                "                    \"extension\": \"\",\n" +
                "                    \"number\": \"1111-1111\",\n" +
                "                    \"verified\": false\n" +
                "                },\n" +
                "                \"alternative_phone\": {\n" +
                "                    \"area_code\": \"\",\n" +
                "                    \"extension\": \"\",\n" +
                "                    \"number\": \"\"\n" +
                "                },\n" +
                "                \"first_name\": \"Test\",\n" +
                "                \"last_name\": \"Test\"\n" +
                "            },\n" +
                "            \"feedback\": {\n" +
                "                \"sale\": {\n" +
                "                    \"id\": 9040811669734,\n" +
                "                    \"date_created\": \"2018-04-04T16:32:48.000-04:00\",\n" +
                "                    \"fulfilled\": true,\n" +
                "                    \"rating\": \"positive\",\n" +
                "                    \"status\": \"hidden\"\n" +
                "                },\n" +
                "                \"purchase\": null\n" +
                "            },\n" +
                "            \"tags\": [\n" +
                "                \"fraud_risk_detected\",\n" +
                "                \"not_delivered\",\n" +
                "                \"paid\"\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 1676997050,\n" +
                "            \"comments\": null,\n" +
                "            \"status\": \"paid\",\n" +
                "            \"status_detail\": {\n" +
                "                \"code\": \"item_price_restriction\",\n" +
                "                \"description\": null\n" +
                "            },\n" +
                "            \"date_created\": \"2018-04-04T16:27:03.000-04:00\",\n" +
                "            \"date_closed\": \"2018-04-04T16:27:07.000-04:00\",\n" +
                "            \"expiration_date\": \"2018-04-15T16:32:39.000-04:00\",\n" +
                "            \"date_last_updated\": \"2018-04-05T12:27:38.829Z\",\n" +
                "            \"hidden_for_seller\": false,\n" +
                "            \"currency_id\": \"BRL\",\n" +
                "            \"order_items\": [\n" +
                "                {\n" +
                "                    \"item\": {\n" +
                "                        \"seller_custom_field\": null,\n" +
                "                        \"condition\": \"used\",\n" +
                "                        \"category_id\": \"MLB1227\",\n" +
                "                        \"variation_id\": null,\n" +
                "                        \"variation_attributes\": [],\n" +
                "                        \"warranty\": null,\n" +
                "                        \"id\": \"MLB1006615921\",\n" +
                "                        \"title\": \"Produto Guegao Teste\"\n" +
                "                    },\n" +
                "                    \"quantity\": 1,\n" +
                "                    \"differential_pricing_id\": 33426180,\n" +
                "                    \"sale_fee\": 0,\n" +
                "                    \"listing_type_id\": \"free\",\n" +
                "                    \"base_currency_id\": null,\n" +
                "                    \"unit_price\": 2,\n" +
                "                    \"full_unit_price\": 2,\n" +
                "                    \"base_exchange_rate\": null,\n" +
                "                    \"currency_id\": \"BRL\",\n" +
                "                    \"manufacturing_days\": null\n" +
                "                }\n" +
                "            ],\n" +
                "            \"total_amount\": 2,\n" +
                "            \"mediations\": [],\n" +
                "            \"payments\": [\n" +
                "                {\n" +
                "                    \"id\": 3597380406,\n" +
                "                    \"order_id\": 1676997050,\n" +
                "                    \"payer_id\": 312388903,\n" +
                "                    \"collector\": {\n" +
                "                        \"id\": 312388855\n" +
                "                    },\n" +
                "                    \"currency_id\": \"BRL\",\n" +
                "                    \"status\": \"approved\",\n" +
                "                    \"status_code\": null,\n" +
                "                    \"status_detail\": \"accredited\",\n" +
                "                    \"transaction_amount\": 2,\n" +
                "                    \"shipping_cost\": 0,\n" +
                "                    \"overpaid_amount\": 0,\n" +
                "                    \"total_paid_amount\": 2,\n" +
                "                    \"marketplace_fee\": 0,\n" +
                "                    \"coupon_amount\": 0,\n" +
                "                    \"date_created\": \"2018-04-04T16:27:03.000-04:00\",\n" +
                "                    \"date_last_modified\": \"2018-04-05T12:27:31.000-04:00\",\n" +
                "                    \"card_id\": 259177274,\n" +
                "                    \"reason\": \"Produto Guegao Teste\",\n" +
                "                    \"activation_uri\": null,\n" +
                "                    \"payment_method_id\": \"visa\",\n" +
                "                    \"installments\": 1,\n" +
                "                    \"issuer_id\": \"25\",\n" +
                "                    \"atm_transfer_reference\": {\n" +
                "                        \"company_id\": null,\n" +
                "                        \"transaction_id\": \"1234567\"\n" +
                "                    },\n" +
                "                    \"coupon_id\": null,\n" +
                "                    \"operation_type\": \"regular_payment\",\n" +
                "                    \"payment_type\": \"credit_card\",\n" +
                "                    \"available_actions\": [\n" +
                "                        \"refund\"\n" +
                "                    ],\n" +
                "                    \"installment_amount\": 2,\n" +
                "                    \"deferred_period\": null,\n" +
                "                    \"date_approved\": \"2018-04-04T16:27:07.000-04:00\",\n" +
                "                    \"authorization_code\": \"1234567\",\n" +
                "                    \"transaction_order_id\": null\n" +
                "                }\n" +
                "            ],\n" +
                "            \"shipping\": {\n" +
                "                \"substatus\": null,\n" +
                "                \"status\": \"to_be_agreed\",\n" +
                "                \"id\": null,\n" +
                "                \"service_id\": null,\n" +
                "                \"currency_id\": null,\n" +
                "                \"shipping_mode\": null,\n" +
                "                \"shipment_type\": null,\n" +
                "                \"sender_id\": null,\n" +
                "                \"picking_type\": null,\n" +
                "                \"date_created\": null,\n" +
                "                \"cost\": null,\n" +
                "                \"date_first_printed\": null\n" +
                "            },\n" +
                "            \"order_request\": {\n" +
                "                \"change\": null,\n" +
                "                \"return\": null\n" +
                "            },\n" +
                "            \"pickup_id\": null,\n" +
                "            \"buyer\": {\n" +
                "                \"id\": 312388903,\n" +
                "                \"nickname\": \"TETE2551691\",\n" +
                "                \"email\": \"ttest.wb84r71+2-oge3donrzhe3taobx@mail.mercadolivre.com\",\n" +
                "                \"phone\": {\n" +
                "                    \"area_code\": \"01\",\n" +
                "                    \"extension\": \"\",\n" +
                "                    \"number\": \"1111-1111\",\n" +
                "                    \"verified\": false\n" +
                "                },\n" +
                "                \"alternative_phone\": {\n" +
                "                    \"area_code\": \"\",\n" +
                "                    \"extension\": \"\",\n" +
                "                    \"number\": \"\"\n" +
                "                },\n" +
                "                \"first_name\": \"Test\",\n" +
                "                \"last_name\": \"Test\",\n" +
                "                \"billing_info\": {\n" +
                "                    \"doc_type\": null,\n" +
                "                    \"doc_number\": null\n" +
                "                }\n" +
                "            },\n" +
                "            \"seller\": {\n" +
                "                \"id\": 312388855,\n" +
                "                \"nickname\": \"TT718371\",\n" +
                "                \"email\": \"ttest.k27yp4t+2-oge3donrzhe3taojt@mail.mercadolivre.com\",\n" +
                "                \"phone\": {\n" +
                "                    \"area_code\": \"01\",\n" +
                "                    \"extension\": \"\",\n" +
                "                    \"number\": \"1111-1111\",\n" +
                "                    \"verified\": false\n" +
                "                },\n" +
                "                \"alternative_phone\": {\n" +
                "                    \"area_code\": \"\",\n" +
                "                    \"extension\": \"\",\n" +
                "                    \"number\": \"\"\n" +
                "                },\n" +
                "                \"first_name\": \"Test\",\n" +
                "                \"last_name\": \"Test\"\n" +
                "            },\n" +
                "            \"feedback\": {\n" +
                "                \"sale\": {\n" +
                "                    \"id\": 9040811669686,\n" +
                "                    \"date_created\": \"2018-04-04T16:32:39.000-04:00\",\n" +
                "                    \"fulfilled\": true,\n" +
                "                    \"rating\": \"positive\",\n" +
                "                    \"status\": \"hidden\"\n" +
                "                },\n" +
                "                \"purchase\": null\n" +
                "            },\n" +
                "            \"tags\": [\n" +
                "                \"fraud_risk_detected\",\n" +
                "                \"not_delivered\",\n" +
                "                \"paid\"\n" +
                "            ]\n" +
                "        }\n" +
                "    ],\n" +
                "    \"sort\": {\n" +
                "        \"id\": \"date_asc\",\n" +
                "        \"name\": \"Date ascending\"\n" +
                "    },\n" +
                "    \"available_sorts\": [\n" +
                "        {\n" +
                "            \"id\": \"date_desc\",\n" +
                "            \"name\": \"Date descending\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"filters\": [\n" +
                "        {\n" +
                "            \"id\": \"order.status\",\n" +
                "            \"name\": \"Order Status\",\n" +
                "            \"type\": \"text\",\n" +
                "            \"values\": [\n" +
                "                {\n" +
                "                    \"id\": \"paid\",\n" +
                "                    \"name\": \"Order Paid\"\n" +
                "                }\n" +
                "            ]\n" +
                "        }\n" +
                "    ],\n" +
                "    \"available_filters\": [\n" +
                "        {\n" +
                "            \"id\": \"order.status\",\n" +
                "            \"name\": \"Order Status\",\n" +
                "            \"type\": \"text\",\n" +
                "            \"values\": [\n" +
                "                {\n" +
                "                    \"id\": \"paid\",\n" +
                "                    \"name\": \"Order Paid\",\n" +
                "                    \"results\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"confirmed\",\n" +
                "                    \"name\": \"Order Confirmed\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"payment_in_process\",\n" +
                "                    \"name\": \"Payment in Process\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"payment_required\",\n" +
                "                    \"name\": \"Payment Required\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"cancelled\",\n" +
                "                    \"name\": \"Order Cancelled\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"invalid\",\n" +
                "                    \"name\": \"Invalid\",\n" +
                "                    \"results\": 0\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": \"shipping.status\",\n" +
                "            \"name\": \"Shipping Status\",\n" +
                "            \"type\": \"text\",\n" +
                "            \"values\": [\n" +
                "                {\n" +
                "                    \"id\": \"to_be_agreed\",\n" +
                "                    \"name\": \"To be agreed\",\n" +
                "                    \"results\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"pending\",\n" +
                "                    \"name\": \"Pending\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"handling\",\n" +
                "                    \"name\": \"Handling\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"ready_to_ship\",\n" +
                "                    \"name\": \"Ready to ship\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"shipped\",\n" +
                "                    \"name\": \"Shipped\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"delivered\",\n" +
                "                    \"name\": \"Delivered\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"not_delivered\",\n" +
                "                    \"name\": \"Not delivered\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"not_verified\",\n" +
                "                    \"name\": \"Not verified\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"cancelled\",\n" +
                "                    \"name\": \"Cancelled\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"closed\",\n" +
                "                    \"name\": \"Closed\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"error\",\n" +
                "                    \"name\": \"Error\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"active\",\n" +
                "                    \"name\": \"Active\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"not_specified\",\n" +
                "                    \"name\": \"Not specified\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"stale_ready_to_ship\",\n" +
                "                    \"name\": \"Stale ready to ship\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"stale_shipped\",\n" +
                "                    \"name\": \"Stale shipped\",\n" +
                "                    \"results\": 0\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": \"feedback.sale.rating\",\n" +
                "            \"name\": \"Feedback rating\",\n" +
                "            \"type\": \"text\",\n" +
                "            \"values\": [\n" +
                "                {\n" +
                "                    \"id\": \"positive\",\n" +
                "                    \"name\": \"Positive\",\n" +
                "                    \"results\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"negative\",\n" +
                "                    \"name\": \"Negative\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"neutral\",\n" +
                "                    \"name\": \"Neutral\",\n" +
                "                    \"results\": 0\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": \"feedback.purchase.rating\",\n" +
                "            \"name\": \"Feedback rating\",\n" +
                "            \"type\": \"text\",\n" +
                "            \"values\": [\n" +
                "                {\n" +
                "                    \"id\": \"negative\",\n" +
                "                    \"name\": \"Negative\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"neutral\",\n" +
                "                    \"name\": \"Neutral\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"positive\",\n" +
                "                    \"name\": \"Positive\",\n" +
                "                    \"results\": 0\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": \"feedback.sale.fulfilled\",\n" +
                "            \"name\": \"Feedback sale fulfilled\",\n" +
                "            \"type\": \"boolean\",\n" +
                "            \"values\": [\n" +
                "                {\n" +
                "                    \"id\": \"T\",\n" +
                "                    \"name\": \"Transaction actually happened\",\n" +
                "                    \"results\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"F\",\n" +
                "                    \"name\": \"Transaction was aborted\",\n" +
                "                    \"results\": 0\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": \"feedback.purchase.fulfilled\",\n" +
                "            \"name\": \"Feedback purchase fulfilled\",\n" +
                "            \"type\": \"boolean\",\n" +
                "            \"values\": [\n" +
                "                {\n" +
                "                    \"id\": \"F\",\n" +
                "                    \"name\": \"Transaction was aborted\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"T\",\n" +
                "                    \"name\": \"Transaction actually happened\",\n" +
                "                    \"results\": 0\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": \"shipping.service_id\",\n" +
                "            \"name\": \"Shipping Service\",\n" +
                "            \"type\": \"long\",\n" +
                "            \"values\": [\n" +
                "                {\n" +
                "                    \"id\": \"21\",\n" +
                "                    \"name\": \"PAC\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"23\",\n" +
                "                    \"name\": \"eSedex\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"22\",\n" +
                "                    \"name\": \"Sedex\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"261\",\n" +
                "                    \"name\": \"Cougar Normal\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"262\",\n" +
                "                    \"name\": \"Cougar Expresso\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"821\",\n" +
                "                    \"name\": \"DHL\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"691\",\n" +
                "                    \"name\": \"Total Medio Rodo\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"1041\",\n" +
                "                    \"name\": \"Correios Sedex Agência\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"293\",\n" +
                "                    \"name\": \"Fulfillment Express\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"841\",\n" +
                "                    \"name\": \"Loggi a domicilio\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"741\",\n" +
                "                    \"name\": \"Cross Border Trade\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"291\",\n" +
                "                    \"name\": \"Fulfillment Normal\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"1061\",\n" +
                "                    \"name\": \"Coleta Correios Sedex Agência\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"292\",\n" +
                "                    \"name\": \"Fulfillment Express\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"263\",\n" +
                "                    \"name\": \"Jadlog Normal\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"264\",\n" +
                "                    \"name\": \"Jadlog Expresso\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"11\",\n" +
                "                    \"name\": \"Otros\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"101\",\n" +
                "                    \"name\": \"Coleta Normal\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"102\",\n" +
                "                    \"name\": \"Coleta Express\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"103\",\n" +
                "                    \"name\": \"Coleta Express\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"282\",\n" +
                "                    \"name\": \"CBT\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"761\",\n" +
                "                    \"name\": \"SuperExpress\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"161\",\n" +
                "                    \"name\": \"CBT\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"991\",\n" +
                "                    \"name\": \"Mercadoenvios Next Day\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"104\",\n" +
                "                    \"name\": \"DGT Normal\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"105\",\n" +
                "                    \"name\": \"Total Normal\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"106\",\n" +
                "                    \"name\": \"Transfolha Normal\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"107\",\n" +
                "                    \"name\": \"Directlog Normal\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"108\",\n" +
                "                    \"name\": \"Directlog Express\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"109\",\n" +
                "                    \"name\": \"Transfolha Express\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"110\",\n" +
                "                    \"name\": \"Total Express\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"751\",\n" +
                "                    \"name\": \"Cross Border Trade\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"1051\",\n" +
                "                    \"name\": \"Coleta Correios PAC Agência\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"301\",\n" +
                "                    \"name\": \"DGT Expresso\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"871\",\n" +
                "                    \"name\": \"Loggi Express a domicilio\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"1031\",\n" +
                "                    \"name\": \"Correios PAC Agência\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"891\",\n" +
                "                    \"name\": \"Estandar\",\n" +
                "                    \"results\": 0\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": \"shipping.substatus\",\n" +
                "            \"name\": \"Shipping Substatus\",\n" +
                "            \"type\": \"text\",\n" +
                "            \"values\": [\n" +
                "                {\n" +
                "                    \"id\": \"cost_exceeded\",\n" +
                "                    \"name\": \"Cost exceeded\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"under_review\",\n" +
                "                    \"name\": \"Under review (e.g. fraud)\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"reviewed\",\n" +
                "                    \"name\": \"Reviewed\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"fraudulent\",\n" +
                "                    \"name\": \"Cancelled Fraudulent\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"waiting_for_payment\",\n" +
                "                    \"name\": \"Waiting for shipping payment to be accredited\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"shipment_paid\",\n" +
                "                    \"name\": \"Shipping cost has been paid\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"regenerating\",\n" +
                "                    \"name\": \"Regenerating\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"waiting_for_label_generation\",\n" +
                "                    \"name\": \"Waiting for label generation\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"invoice_pending\",\n" +
                "                    \"name\": \"Invoice pending\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"waiting_for_return_confirmation\",\n" +
                "                    \"name\": \"Waiting for return confirmation\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"return_confirmed\",\n" +
                "                    \"name\": \"Return Confirmed\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"manufacturing\",\n" +
                "                    \"name\": \"Manufacturing\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"ready_to_print\",\n" +
                "                    \"name\": \"Ready to print\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"printed\",\n" +
                "                    \"name\": \"Printed\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"in_pickup_list\",\n" +
                "                    \"name\": \"In pikcup list\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"ready_for_pkl_creation\",\n" +
                "                    \"name\": \"Ready for pkl creation\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"ready_for_pickup\",\n" +
                "                    \"name\": \"Ready for pickup\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"ready_for_dropoff\",\n" +
                "                    \"name\": \"Ready for drop off\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"picked_up\",\n" +
                "                    \"name\": \"Picked up\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"stale\",\n" +
                "                    \"name\": \"Stale shipped\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"dropped_off\",\n" +
                "                    \"name\": \"Dropped off in Melipoint\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"in_hub\",\n" +
                "                    \"name\": \"In hub\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"measures_ready\",\n" +
                "                    \"name\": \"Measures and weight ready\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"waiting_for_carrier_authorization\",\n" +
                "                    \"name\": \"Waiting for carrier authorization\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"authorized_by_carrier\",\n" +
                "                    \"name\": \"Authorized by carrier\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"in_packing_list\",\n" +
                "                    \"name\": \"In packing list\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"in_plp\",\n" +
                "                    \"name\": \"In PLP\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"in_warehouse\",\n" +
                "                    \"name\": \"In Warehouse\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"ready_to_pack\",\n" +
                "                    \"name\": \"Ready to Pack\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"delayed\",\n" +
                "                    \"name\": \"Delayed\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"waiting_for_withdrawal\",\n" +
                "                    \"name\": \"Waiting for withdrawal\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"contact_with_carrier_required\",\n" +
                "                    \"name\": \"Contact with carrier required\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"receiver_absent\",\n" +
                "                    \"name\": \"Receiver absent\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"reclaimed\",\n" +
                "                    \"name\": \"Reclaimed\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"not_localized\",\n" +
                "                    \"name\": \"Not localized\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"forwarded_to_third\",\n" +
                "                    \"name\": \"Forwarded to third party\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"soon_deliver\",\n" +
                "                    \"name\": \"Soon deliver\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"refused_delivery\",\n" +
                "                    \"name\": \"Delivery refused\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"bad_address\",\n" +
                "                    \"name\": \"Bad address\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"negative_feedback\",\n" +
                "                    \"name\": \"Stale shipped forced to not delivered due to negative feedback by buyer\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"need_review\",\n" +
                "                    \"name\": \"Need to review carrier status to understand what happened\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"operator_intervention\",\n" +
                "                    \"name\": \"Need operator intervention\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"claimed_me\",\n" +
                "                    \"name\": \"Not delivered that was claimed by the receiver\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"retained\",\n" +
                "                    \"name\": \"Retained\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"damaged\",\n" +
                "                    \"name\": \"Package damaged in hub\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"fulfilled_feedback\",\n" +
                "                    \"name\": \"Fulfilled by buyer feedback\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"no_action_taken\",\n" +
                "                    \"name\": \"No action taken by buyer\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"double_refund\",\n" +
                "                    \"name\": \"Double Refund\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"returning_to_sender\",\n" +
                "                    \"name\": \"Returning to sender\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"stolen\",\n" +
                "                    \"name\": \"Stolen\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"returned\",\n" +
                "                    \"name\": \"Returned\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"confiscated\",\n" +
                "                    \"name\": \"confiscated\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"to_review\",\n" +
                "                    \"name\": \"Closed shipment\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"destroyed\",\n" +
                "                    \"name\": \"Destroyed\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"lost\",\n" +
                "                    \"name\": \"Package lost\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"cancelled_measurement_exceeded\",\n" +
                "                    \"name\": \"Shipment cancelled for measurement exceeded\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"returned_to_hub\",\n" +
                "                    \"name\": \"Returned to hub\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"returned_to_agency\",\n" +
                "                    \"name\": \"Returned to agency\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"picked_up_for_return\",\n" +
                "                    \"name\": \"Picked up for return\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"returning_to_warehouse\",\n" +
                "                    \"name\": \"Returning to Warehouse\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"returned_to_warehouse\",\n" +
                "                    \"name\": \"Returned to Warehouse\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"recovered\",\n" +
                "                    \"name\": \"Recovered\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"label_expired\",\n" +
                "                    \"name\": \"Label Expired\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"cancelled_manually\",\n" +
                "                    \"name\": \"Cancelled Manually\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"return_expired\",\n" +
                "                    \"name\": \"Return expired\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"return_session_expired\",\n" +
                "                    \"name\": \"Return session expired\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"unfulfillable\",\n" +
                "                    \"name\": \"Unfulfillable\",\n" +
                "                    \"results\": 0\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": \"feedback.status\",\n" +
                "            \"name\": \"Feedback Status\",\n" +
                "            \"type\": \"text\",\n" +
                "            \"values\": [\n" +
                "                {\n" +
                "                    \"id\": \"pending\",\n" +
                "                    \"name\": \"Waiting for your feedback\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"waiting_buyer\",\n" +
                "                    \"name\": \"Waiting for Buyer's feedback\",\n" +
                "                    \"results\": 2\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": \"tags\",\n" +
                "            \"name\": \"Tags\",\n" +
                "            \"type\": \"text\",\n" +
                "            \"values\": [\n" +
                "                {\n" +
                "                    \"id\": \"not_delivered\",\n" +
                "                    \"name\": \"Not Delivered\",\n" +
                "                    \"results\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"paid\",\n" +
                "                    \"name\": \"Order Paid\",\n" +
                "                    \"results\": 2\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"delivered\",\n" +
                "                    \"name\": \"Delivered\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"not_paid\",\n" +
                "                    \"name\": \"Order Not Paid\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"claim_closed\",\n" +
                "                    \"name\": \"Claim Closed\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"claim_opened\",\n" +
                "                    \"name\": \"Claim Opened\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"not_processed\",\n" +
                "                    \"name\": \"Not processed order\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"processed\",\n" +
                "                    \"name\": \"Processed order\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"returned\",\n" +
                "                    \"name\": \"Returned order\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"pack_order\",\n" +
                "                    \"name\": \"Cart Order\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"reservation\",\n" +
                "                    \"name\": \"Reservation Order\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"mshops\",\n" +
                "                    \"name\": \"Order from Mercado Shops\",\n" +
                "                    \"results\": 0\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": \"mediations.status\",\n" +
                "            \"name\": \"Mediation Status\",\n" +
                "            \"type\": \"text\",\n" +
                "            \"values\": [\n" +
                "                {\n" +
                "                    \"id\": \"claim_opened\",\n" +
                "                    \"name\": \"Claim opened\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"claim_closed\",\n" +
                "                    \"name\": \"Claim closed\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"dispute_opened\",\n" +
                "                    \"name\": \"Dispute opened\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"dispute_closed\",\n" +
                "                    \"name\": \"Dispute closed\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"seller_dispute_opened\",\n" +
                "                    \"name\": \"Seller dispute opened\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"seller_dispute_closed\",\n" +
                "                    \"name\": \"Seller dispute closed\",\n" +
                "                    \"results\": 0\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": \"order_request.return\",\n" +
                "            \"name\": \"Order-Request Return status\",\n" +
                "            \"type\": \"text\",\n" +
                "            \"values\": [\n" +
                "                {\n" +
                "                    \"id\": \"required\",\n" +
                "                    \"name\": \"Return required\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"cancelled\",\n" +
                "                    \"name\": \"Return cancelled\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"expired\",\n" +
                "                    \"name\": \"Return expired\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"accepted\",\n" +
                "                    \"name\": \"Return accepted\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"partially_paid\",\n" +
                "                    \"name\": \"Return partially paid\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"paid\",\n" +
                "                    \"name\": \"Return paid\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"failed\",\n" +
                "                    \"name\": \"Return failed\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"closed\",\n" +
                "                    \"name\": \"Return closed\",\n" +
                "                    \"results\": 0\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": \"order_request.change\",\n" +
                "            \"name\": \"Order-Request Change status\",\n" +
                "            \"type\": \"text\",\n" +
                "            \"values\": [\n" +
                "                {\n" +
                "                    \"id\": \"required\",\n" +
                "                    \"name\": \"Change required\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"cancelled\",\n" +
                "                    \"name\": \"Change cancelled\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"expired\",\n" +
                "                    \"name\": \"Change expired\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"accepted\",\n" +
                "                    \"name\": \"Change accepted\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"partially_paid\",\n" +
                "                    \"name\": \"Change partially paid\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"paid\",\n" +
                "                    \"name\": \"Change paid\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"failed\",\n" +
                "                    \"name\": \"Change failed\",\n" +
                "                    \"results\": 0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": \"closed\",\n" +
                "                    \"name\": \"Change closed\",\n" +
                "                    \"results\": 0\n" +
                "                }\n" +
                "            ]\n" +
                "        }\n" +
                "    ],\n" +
                "    \"paging\": {\n" +
                "        \"total\": 2,\n" +
                "        \"offset\": 0,\n" +
                "        \"limit\": 50\n" +
                "    },\n" +
                "    \"display\": \"complete\"\n" +
                "}";
    }

}
