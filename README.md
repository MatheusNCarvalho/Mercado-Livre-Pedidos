# Mercado Livre Pedidos
Pequeno projeto de demostração, aonde recupera o json de pedido da api do mercado livre e converte para objetos
Obs.: Contém um teste para demostrar a conversão.

#Json Usando para conversão em objeto java...

```js
{
    "query": "",
    "results": [
        {
            "id": 1676920826,
            "comments": null,
            "status": "paid",
            "status_detail": {
                "code": "item_price_restriction",
                "description": null
            },
            "date_created": "2018-04-04T15:04:59.000-04:00",
            "date_closed": "2018-04-04T15:11:26.000-04:00",
            "expiration_date": "2018-04-15T16:32:48.000-04:00",
            "date_last_updated": "2018-04-05T12:27:36.377Z",
            "hidden_for_seller": false,
            "currency_id": "BRL",
            "order_items": [
                {
                    "item": {
                        "seller_custom_field": null,
                        "condition": "used",
                        "category_id": "MLB3530",
                        "variation_id": null,
                        "variation_attributes": [],
                        "warranty": null,
                        "id": "MLB1006547759",
                        "title": "Produto De Item De Teste!"
                    },
                    "quantity": 1,
                    "differential_pricing_id": 33426180,
                    "sale_fee": 0,
                    "listing_type_id": "free",
                    "base_currency_id": null,
                    "unit_price": 2,
                    "full_unit_price": 2,
                    "base_exchange_rate": null,
                    "currency_id": "BRL",
                    "manufacturing_days": null
                }
            ],
            "total_amount": 2,
            "mediations": [],
            "payments": [
                {
                    "id": 3597173112,
                    "order_id": 1676920826,
                    "payer_id": 312388903,
                    "collector": {
                        "id": 312388855
                    },
                    "currency_id": "BRL",
                    "status": "rejected",
                    "status_code": null,
                    "status_detail": "cc_rejected_bad_filled_card_number",
                    "transaction_amount": 2,
                    "shipping_cost": 0,
                    "overpaid_amount": 0,
                    "total_paid_amount": 2,
                    "marketplace_fee": 0,
                    "coupon_amount": 0,
                    "date_created": "2018-04-04T15:05:00.000-04:00",
                    "date_last_modified": "2018-04-04T15:05:01.000-04:00",
                    "card_id": null,
                    "reason": "Produto De Item De Teste!",
                    "activation_uri": null,
                    "payment_method_id": "visa",
                    "installments": 1,
                    "issuer_id": "25",
                    "atm_transfer_reference": {
                        "company_id": null,
                        "transaction_id": "1234567"
                    },
                    "coupon_id": null,
                    "operation_type": "regular_payment",
                    "payment_type": "credit_card",
                    "available_actions": [],
                    "installment_amount": 2,
                    "deferred_period": null,
                    "date_approved": null,
                    "authorization_code": null,
                    "transaction_order_id": null
                },
                {
                    "id": 3597180536,
                    "order_id": 1676920826,
                    "payer_id": 312388903,
                    "collector": {
                        "id": 312388855
                    },
                    "currency_id": "BRL",
                    "status": "approved",
                    "status_code": null,
                    "status_detail": "accredited",
                    "transaction_amount": 2,
                    "shipping_cost": 0,
                    "overpaid_amount": 0,
                    "total_paid_amount": 2,
                    "marketplace_fee": 0,
                    "coupon_amount": 0,
                    "date_created": "2018-04-04T15:11:25.000-04:00",
                    "date_last_modified": "2018-04-05T12:27:29.000-04:00",
                    "card_id": null,
                    "reason": "Produto De Item De Teste!",
                    "activation_uri": null,
                    "payment_method_id": "visa",
                    "installments": 1,
                    "issuer_id": "25",
                    "atm_transfer_reference": {
                        "company_id": null,
                        "transaction_id": "1234567"
                    },
                    "coupon_id": null,
                    "operation_type": "regular_payment",
                    "payment_type": "credit_card",
                    "available_actions": [
                        "refund"
                    ],
                    "installment_amount": 2,
                    "deferred_period": null,
                    "date_approved": "2018-04-04T15:11:26.000-04:00",
                    "authorization_code": "1234567",
                    "transaction_order_id": null
                },
                {
                    "id": 3597174266,
                    "order_id": 1676920826,
                    "payer_id": 312388903,
                    "collector": {
                        "id": 312388855
                    },
                    "currency_id": "BRL",
                    "status": "rejected",
                    "status_code": null,
                    "status_detail": "cc_rejected_other_reason",
                    "transaction_amount": 2,
                    "shipping_cost": 0,
                    "overpaid_amount": 0,
                    "total_paid_amount": 2,
                    "marketplace_fee": 0,
                    "coupon_amount": 0,
                    "date_created": "2018-04-04T15:05:57.000-04:00",
                    "date_last_modified": "2018-04-04T15:05:57.000-04:00",
                    "card_id": null,
                    "reason": "Produto De Item De Teste!",
                    "activation_uri": null,
                    "payment_method_id": "visa",
                    "installments": 1,
                    "issuer_id": "25",
                    "atm_transfer_reference": {
                        "company_id": null,
                        "transaction_id": "3354277"
                    },
                    "coupon_id": null,
                    "operation_type": "regular_payment",
                    "payment_type": "credit_card",
                    "available_actions": [],
                    "installment_amount": 2,
                    "deferred_period": null,
                    "date_approved": null,
                    "authorization_code": null,
                    "transaction_order_id": null
                },
                {
                    "id": 3596885248,
                    "order_id": 1676920826,
                    "payer_id": 312388903,
                    "collector": {
                        "id": 312388855
                    },
                    "currency_id": "BRL",
                    "status": "rejected",
                    "status_code": null,
                    "status_detail": "cc_rejected_call_for_authorize",
                    "transaction_amount": 2,
                    "shipping_cost": 0,
                    "overpaid_amount": 0,
                    "total_paid_amount": 2,
                    "marketplace_fee": 0,
                    "coupon_amount": 0,
                    "date_created": "2018-04-04T15:08:09.000-04:00",
                    "date_last_modified": "2018-04-04T15:08:09.000-04:00",
                    "card_id": null,
                    "reason": "Produto De Item De Teste!",
                    "activation_uri": null,
                    "payment_method_id": "master",
                    "installments": 1,
                    "issuer_id": "24",
                    "atm_transfer_reference": {
                        "company_id": null,
                        "transaction_id": "085690"
                    },
                    "coupon_id": null,
                    "operation_type": "regular_payment",
                    "payment_type": "credit_card",
                    "available_actions": [],
                    "installment_amount": 2,
                    "deferred_period": null,
                    "date_approved": null,
                    "authorization_code": null,
                    "transaction_order_id": null
                },
                {
                    "id": 3597175437,
                    "order_id": 1676920826,
                    "payer_id": 312388903,
                    "collector": {
                        "id": 312388855
                    },
                    "currency_id": "BRL",
                    "status": "rejected",
                    "status_code": null,
                    "status_detail": "cc_rejected_call_for_authorize",
                    "transaction_amount": 2,
                    "shipping_cost": 0,
                    "overpaid_amount": 0,
                    "total_paid_amount": 2,
                    "marketplace_fee": 0,
                    "coupon_amount": 0,
                    "date_created": "2018-04-04T15:06:57.000-04:00",
                    "date_last_modified": "2018-04-04T15:06:57.000-04:00",
                    "card_id": null,
                    "reason": "Produto De Item De Teste!",
                    "activation_uri": null,
                    "payment_method_id": "master",
                    "installments": 1,
                    "issuer_id": "24",
                    "atm_transfer_reference": {
                        "company_id": null,
                        "transaction_id": "087102"
                    },
                    "coupon_id": null,
                    "operation_type": "regular_payment",
                    "payment_type": "credit_card",
                    "available_actions": [],
                    "installment_amount": 2,
                    "deferred_period": null,
                    "date_approved": null,
                    "authorization_code": null,
                    "transaction_order_id": null
                },
                {
                    "id": 3597177281,
                    "order_id": 1676920826,
                    "payer_id": 312388903,
                    "collector": {
                        "id": 312388855
                    },
                    "currency_id": "BRL",
                    "status": "rejected",
                    "status_code": null,
                    "status_detail": "cc_rejected_call_for_authorize",
                    "transaction_amount": 2,
                    "shipping_cost": 0,
                    "overpaid_amount": 0,
                    "total_paid_amount": 2,
                    "marketplace_fee": 0,
                    "coupon_amount": 0,
                    "date_created": "2018-04-04T15:08:30.000-04:00",
                    "date_last_modified": "2018-04-04T15:08:30.000-04:00",
                    "card_id": null,
                    "reason": "Produto De Item De Teste!",
                    "activation_uri": null,
                    "payment_method_id": "master",
                    "installments": 1,
                    "issuer_id": "24",
                    "atm_transfer_reference": {
                        "company_id": null,
                        "transaction_id": "089124"
                    },
                    "coupon_id": null,
                    "operation_type": "regular_payment",
                    "payment_type": "credit_card",
                    "available_actions": [],
                    "installment_amount": 2,
                    "deferred_period": null,
                    "date_approved": null,
                    "authorization_code": null,
                    "transaction_order_id": null
                }
            ],
            "shipping": {
                "substatus": null,
                "status": "to_be_agreed",
                "id": null,
                "service_id": null,
                "currency_id": null,
                "shipping_mode": null,
                "shipment_type": null,
                "sender_id": null,
                "picking_type": null,
                "date_created": null,
                "cost": null,
                "date_first_printed": null
            },
            "order_request": {
                "change": null,
                "return": null
            },
            "pickup_id": null,
            "buyer": {
                "id": 312388903,
                "nickname": "TETE2551691",
                "email": "ttest.wb84r71+2-oge3donrzgiydqnrt@mail.mercadolivre.com",
                "phone": {
                    "area_code": "01",
                    "extension": "",
                    "number": "1111-1111",
                    "verified": false
                },
                "alternative_phone": {
                    "area_code": "",
                    "extension": "",
                    "number": ""
                },
                "first_name": "Test",
                "last_name": "Test",
                "billing_info": {
                    "doc_type": null,
                    "doc_number": null
                }
            },
            "seller": {
                "id": 312388855,
                "nickname": "TT718371",
                "email": "ttest.k27yp4t+2-oge3donrzgiydqnrz@mail.mercadolivre.com",
                "phone": {
                    "area_code": "01",
                    "extension": "",
                    "number": "1111-1111",
                    "verified": false
                },
                "alternative_phone": {
                    "area_code": "",
                    "extension": "",
                    "number": ""
                },
                "first_name": "Test",
                "last_name": "Test"
            },
            "feedback": {
                "sale": {
                    "id": 9040811669734,
                    "date_created": "2018-04-04T16:32:48.000-04:00",
                    "fulfilled": true,
                    "rating": "positive",
                    "status": "hidden"
                },
                "purchase": null
            },
            "tags": [
                "fraud_risk_detected",
                "not_delivered",
                "paid"
            ]
        },
        {
            "id": 1676997050,
            "comments": null,
            "status": "paid",
            "status_detail": {
                "code": "item_price_restriction",
                "description": null
            },
            "date_created": "2018-04-04T16:27:03.000-04:00",
            "date_closed": "2018-04-04T16:27:07.000-04:00",
            "expiration_date": "2018-04-15T16:32:39.000-04:00",
            "date_last_updated": "2018-04-05T12:27:38.829Z",
            "hidden_for_seller": false,
            "currency_id": "BRL",
            "order_items": [
                {
                    "item": {
                        "seller_custom_field": null,
                        "condition": "used",
                        "category_id": "MLB1227",
                        "variation_id": null,
                        "variation_attributes": [],
                        "warranty": null,
                        "id": "MLB1006615921",
                        "title": "Produto Guegao Teste"
                    },
                    "quantity": 1,
                    "differential_pricing_id": 33426180,
                    "sale_fee": 0,
                    "listing_type_id": "free",
                    "base_currency_id": null,
                    "unit_price": 2,
                    "full_unit_price": 2,
                    "base_exchange_rate": null,
                    "currency_id": "BRL",
                    "manufacturing_days": null
                }
            ],
            "total_amount": 2,
            "mediations": [],
            "payments": [
                {
                    "id": 3597380406,
                    "order_id": 1676997050,
                    "payer_id": 312388903,
                    "collector": {
                        "id": 312388855
                    },
                    "currency_id": "BRL",
                    "status": "approved",
                    "status_code": null,
                    "status_detail": "accredited",
                    "transaction_amount": 2,
                    "shipping_cost": 0,
                    "overpaid_amount": 0,
                    "total_paid_amount": 2,
                    "marketplace_fee": 0,
                    "coupon_amount": 0,
                    "date_created": "2018-04-04T16:27:03.000-04:00",
                    "date_last_modified": "2018-04-05T12:27:31.000-04:00",
                    "card_id": 259177274,
                    "reason": "Produto Guegao Teste",
                    "activation_uri": null,
                    "payment_method_id": "visa",
                    "installments": 1,
                    "issuer_id": "25",
                    "atm_transfer_reference": {
                        "company_id": null,
                        "transaction_id": "1234567"
                    },
                    "coupon_id": null,
                    "operation_type": "regular_payment",
                    "payment_type": "credit_card",
                    "available_actions": [
                        "refund"
                    ],
                    "installment_amount": 2,
                    "deferred_period": null,
                    "date_approved": "2018-04-04T16:27:07.000-04:00",
                    "authorization_code": "1234567",
                    "transaction_order_id": null
                }
            ],
            "shipping": {
                "substatus": null,
                "status": "to_be_agreed",
                "id": null,
                "service_id": null,
                "currency_id": null,
                "shipping_mode": null,
                "shipment_type": null,
                "sender_id": null,
                "picking_type": null,
                "date_created": null,
                "cost": null,
                "date_first_printed": null
            },
            "order_request": {
                "change": null,
                "return": null
            },
            "pickup_id": null,
            "buyer": {
                "id": 312388903,
                "nickname": "TETE2551691",
                "email": "ttest.wb84r71+2-oge3donrzhe3taobx@mail.mercadolivre.com",
                "phone": {
                    "area_code": "01",
                    "extension": "",
                    "number": "1111-1111",
                    "verified": false
                },
                "alternative_phone": {
                    "area_code": "",
                    "extension": "",
                    "number": ""
                },
                "first_name": "Test",
                "last_name": "Test",
                "billing_info": {
                    "doc_type": null,
                    "doc_number": null
                }
            },
            "seller": {
                "id": 312388855,
                "nickname": "TT718371",
                "email": "ttest.k27yp4t+2-oge3donrzhe3taojt@mail.mercadolivre.com",
                "phone": {
                    "area_code": "01",
                    "extension": "",
                    "number": "1111-1111",
                    "verified": false
                },
                "alternative_phone": {
                    "area_code": "",
                    "extension": "",
                    "number": ""
                },
                "first_name": "Test",
                "last_name": "Test"
            },
            "feedback": {
                "sale": {
                    "id": 9040811669686,
                    "date_created": "2018-04-04T16:32:39.000-04:00",
                    "fulfilled": true,
                    "rating": "positive",
                    "status": "hidden"
                },
                "purchase": null
            },
            "tags": [
                "fraud_risk_detected",
                "not_delivered",
                "paid"
            ]
        }
    ]
}```
