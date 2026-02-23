<!DOCTYPE html>
<html>

    <title>WhatsApp Login</title>
    <style>
        body {
            font-family: Arial;
            background: #ece5dd;
            text-align: center;
        }
        .box {
            background: white;
            width: 300px;
            margin: 100px auto;
            padding: 20px;
            border-radius: 10px;
        }
        h2 {
            color: #25D366;
        }
        input {
            width: 90%;
            padding: 10px;
            margin: 8px;
        }
        button {
            background: #25D366;
            border: none;
            padding: 10px;
            width: 95%;
            color: white;
        }
    </style>
</head>
<body>

<div class="box">
    <h2>WhatsApp Login</h2>

    <form action="login" method="post">
        <input type="text" name="phone" placeholder="Phone Number" required />
        <input type="password" name="password" placeholder="Password" required />
        <button type="submit">Login</button>
    </form>
</div>

</body>
</html>
