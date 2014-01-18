package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneArrayOfOneStringsWithMaxLengthOf9_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _oneArrayOfOneStringsWithMaxLengthOf9: Array[String]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneArrayOfOneStringsWithMaxLengthOf9_2 => c.URI == URI
    case _ => false
  }

  override def toString = "OneArrayOfOneStringsWithMaxLengthOf9_2("+ URI +")"

   def copy(oneArrayOfOneStringsWithMaxLengthOf9: Array[String] = this._oneArrayOfOneStringsWithMaxLengthOf9): OneArrayOfOneStringsWithMaxLengthOf9_2 = {

  require(oneArrayOfOneStringsWithMaxLengthOf9 ne null, "Null value was provided for property \"oneArrayOfOneStringsWithMaxLengthOf9\"")
  com.dslplatform.api.Guards.checkArrayLength(oneArrayOfOneStringsWithMaxLengthOf9, 9)
  com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneStringsWithMaxLengthOf9)
    new OneArrayOfOneStringsWithMaxLengthOf9_2(_URI = this.URI, __locator = this.__locator, _oneArrayOfOneStringsWithMaxLengthOf9 = oneArrayOfOneStringsWithMaxLengthOf9)
  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneArrayOfOneStringsWithMaxLengthOf9_2): this.type = {
    this._URI = result._URI
    this._oneArrayOfOneStringsWithMaxLengthOf9 = result._oneArrayOfOneStringsWithMaxLengthOf9
    this
  }

  def create()(implicit locator: ServiceLocator, ec: ExecutionContext, duration: Duration): this.type = {
    __locator = Some(Option(locator).getOrElse(Bootstrap.getLocator))
    val toUpdateWith = Await.result(__locator.get.resolve(classOf[CrudProxy]).create(this), duration)
    updateWithAnother(toUpdateWith)

  }

  def update()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result(__locator.get.resolve(classOf[CrudProxy]).update(this), duration)
    updateWithAnother(toUpdateWith)

  }

  def delete()(implicit ec: ExecutionContext, duration: Duration) = {
    if (__locator.isEmpty) throw new IllegalArgumentException("Can't delete aggregate before it's saved")
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneArrayOfOneStringsWithMaxLengthOf9_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneStringsWithMaxLengthOf9")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneArrayOfOneStringsWithMaxLengthOf9 = {
    _oneArrayOfOneStringsWithMaxLengthOf9
  }

  def oneArrayOfOneStringsWithMaxLengthOf9_= (value: Array[String]) {
    com.dslplatform.api.Guards.checkArrayLength(value, 9)
    com.dslplatform.api.Guards.checkArrayNulls(value)
    _oneArrayOfOneStringsWithMaxLengthOf9 = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfOneStringsWithMaxLengthOf9") oneArrayOfOneStringsWithMaxLengthOf9: Array[String]
  ) =
    this(__locator = Some(__locator), _URI = URI, _oneArrayOfOneStringsWithMaxLengthOf9 = if (oneArrayOfOneStringsWithMaxLengthOf9 == null) Array.empty else oneArrayOfOneStringsWithMaxLengthOf9)

}

object OneArrayOfOneStringsWithMaxLengthOf9_2 extends AggregateRootCompanion[OneArrayOfOneStringsWithMaxLengthOf9_2]{

  def apply(
    oneArrayOfOneStringsWithMaxLengthOf9: Array[String] = Array.empty
  ) = {
    com.dslplatform.api.Guards.checkArrayLength(oneArrayOfOneStringsWithMaxLengthOf9, 9)
    com.dslplatform.api.Guards.checkArrayNulls(oneArrayOfOneStringsWithMaxLengthOf9)
    require(oneArrayOfOneStringsWithMaxLengthOf9 ne null, "Null value was provided for property \"oneArrayOfOneStringsWithMaxLengthOf9\"")
    new OneArrayOfOneStringsWithMaxLengthOf9_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _oneArrayOfOneStringsWithMaxLengthOf9 = oneArrayOfOneStringsWithMaxLengthOf9)
  }

}
