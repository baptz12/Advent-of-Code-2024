public class AdventCodeDay2_2024
{
  public static void main(String[] args) throws Exception
  {
    int result = 0;

    for (int j = 0; j < args.length; j++)
    {
      String[] numbers = args[j].split(";");
      int temp = 0;

      boolean inc = false;
      boolean dec = false;
      for (int i = 0; i < numbers.length; i++)
      {

        int nb = Integer.parseInt(numbers[i]);
        if (temp == 0)
        {
          temp = nb;
          continue;
        }
        if (temp != 0)
        {
          if (nb > temp && i == 1)
          {
            inc = true;
          }
          if (nb < temp && i == 1)
          {
            dec = true;
          }
          int diff = nb - temp;
          if (i > 1)
          {
            if (inc && nb > temp && (diff <= 3 && diff >= 1))
            {
              if (numbers.length - 1 == i)
              {
                result++;
                continue;
              }
              temp = nb;
              continue;
            }
            else if (dec && nb < temp && (diff >= -3 && diff <= -1))
            {
              if (numbers.length - 1 == i)
              {
                result++;
                continue;
              }
              temp = nb;
              continue;
            }
            else
            {
              break;
            }
          }
          else if ((dec && (diff >= -3 && diff <= -1))
              || (inc && (diff <= 3 && diff >= 1)))
          {
            temp = nb;
          }
          else
          {
            break;
          }
        }
      }
    }
    System.out.println(result);
  }
}
