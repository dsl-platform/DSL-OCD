package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneListOfOneStringsWithMaxLengthOf9_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _oneListOfOneStringsWithMaxLengthOf9: IndexedSeq[String]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonGetter("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneListOfOneStringsWithMaxLengthOf9_2 => c.URI == URI
    case _ => false
  }

  override def toString = "OneListOfOneStringsWithMaxLengthOf9_2("+ URI +")"

   def copy(oneListOfOneStringsWithMaxLengthOf9: IndexedSeq[String] = this._oneListOfOneStringsWithMaxLengthOf9): OneListOfOneStringsWithMaxLengthOf9_2 = {

  require(oneListOfOneStringsWithMaxLengthOf9 ne null, "Null value was provided for property \"oneListOfOneStringsWithMaxLengthOf9\"")
  com.dslplatform.api.Guards.checkCollectionLength(oneListOfOneStringsWithMaxLengthOf9, 9)
  com.dslplatform.api.Guards.checkCollectionNulls(oneListOfOneStringsWithMaxLengthOf9)
    new OneListOfOneStringsWithMaxLengthOf9_2(_URI = this.URI, __locator = this.__locator, _oneListOfOneStringsWithMaxLengthOf9 = oneListOfOneStringsWithMaxLengthOf9)
  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneListOfOneStringsWithMaxLengthOf9_2): this.type = {
    this._URI = result._URI
    this._oneListOfOneStringsWithMaxLengthOf9 = result._oneListOfOneStringsWithMaxLengthOf9
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneListOfOneStringsWithMaxLengthOf9_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("oneListOfOneStringsWithMaxLengthOf9")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneListOfOneStringsWithMaxLengthOf9 = {
    _oneListOfOneStringsWithMaxLengthOf9
  }

  def oneListOfOneStringsWithMaxLengthOf9_= (value: IndexedSeq[String]) {
    com.dslplatform.api.Guards.checkCollectionLength(value, 9)
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _oneListOfOneStringsWithMaxLengthOf9 = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneStringsWithMaxLengthOf9") oneListOfOneStringsWithMaxLengthOf9: IndexedSeq[String]
  ) =
    this(__locator = Some(__locator), _URI = URI, _oneListOfOneStringsWithMaxLengthOf9 = if (oneListOfOneStringsWithMaxLengthOf9 == null) IndexedSeq.empty else oneListOfOneStringsWithMaxLengthOf9)

}

object OneListOfOneStringsWithMaxLengthOf9_2 extends AggregateRootCompanion[OneListOfOneStringsWithMaxLengthOf9_2]{

  def apply(
    oneListOfOneStringsWithMaxLengthOf9: IndexedSeq[String] = IndexedSeq.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionLength(oneListOfOneStringsWithMaxLengthOf9, 9)
    com.dslplatform.api.Guards.checkCollectionNulls(oneListOfOneStringsWithMaxLengthOf9)
    require(oneListOfOneStringsWithMaxLengthOf9 ne null, "Null value was provided for property \"oneListOfOneStringsWithMaxLengthOf9\"")
    new OneListOfOneStringsWithMaxLengthOf9_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _oneListOfOneStringsWithMaxLengthOf9 = oneListOfOneStringsWithMaxLengthOf9)
  }

}
