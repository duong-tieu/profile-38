<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Ứng dụng Từ điển đơn giản</title>
    <meta charset="UTF-8">
    <style>
        input[type=text], select {
            padding: 12px 20px;
            margin: 8px 0;
            display: inline-block;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }

        button {
            background-color: #4CAF50;
            color: white;
            padding: 14px 20px;
            margin: 8px 0;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        button:hover {
            background-color: #45a049;
        }

        div {
            border-radius: 5px;
            background-color: #f2f2f2;
            padding: 20px;
        }
    </style>
    <script>
        // Tạo một mảng chứa các từ và nghĩa của từ tương ứng trong tiếng Việt và tiếng Anh
        var dictionary = [
            {eng: "apple", vie: "quả táo"},
            {eng: "banana", vie: "quả chuối"},
            {eng: "car", vie: "xe hơi"},
            {eng: "dog", vie: "con chó"},
            {eng: "water lemon",vie:"quả dưa hấu"},

        ];

        // Tạo hàm để tra cứu từ
        function searchWord() {
            var inputWord = document.getElementById("inputWord").value;
            var found = false;

            // Duyệt qua mảng từ để tìm kiếm từ cần tra cứu
            for (var i = 0; i < dictionary.length; i++) {
                if (dictionary[i].eng === inputWord || dictionary[i].vie === inputWord) {
                    document.getElementById("result").innerHTML = "Từ '" + inputWord + "' có nghĩa là '" + dictionary[i].vie + "'.";
                    found = true;
                    break;
                }
            }

            if (!found) {
                document.getElementById("result").innerHTML = "Không tìm thấy từ này trong từ điển!";
            }
        }
    </script>
</head>
        <body>
          <h1>Tra cứu từ Anh-Việt</h1>
          <label>Nhập từ cần tra cứu:</label>
          <input type="text" id="engWord">
          <button onclick="searchWord()">Tìm kiếm</button>
          <p id="result"></p>
        </body>
</html>